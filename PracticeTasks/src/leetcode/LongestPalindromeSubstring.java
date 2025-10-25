package leetcode;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println(longestPalindromeBruteForce(s1));
        System.out.println(longestPalindromeBruteForce(s2));

        System.out.println(longestPalindromeDP(s1));
        System.out.println(longestPalindromeDP(s2));

        System.out.println(longestPalindromeExpandAroundCenter(s1));
        System.out.println(longestPalindromeExpandAroundCenter(s2));
    }

    public static String longestPalindromeBruteForce(String s) {
        if (s == null || s.length() < 2) return s;

        int n = s.length();
        String longest = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

        private static boolean isPalindrome (String str){
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left++) != str.charAt(right--)) return false;
            }
            return true;
        }


    public static String longestPalindromeDP(String s) {
        if (s == null || s.length() < 2) return s;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static String longestPalindromeExpandAroundCenter(String s) {
        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
