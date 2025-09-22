package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
       String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       StringBuilder sb = new StringBuilder(cleaned).reverse();
       String reversed = sb.toString();
       if (reversed.equals(cleaned)) {
           return true;
        }
       return false;
    }
}
