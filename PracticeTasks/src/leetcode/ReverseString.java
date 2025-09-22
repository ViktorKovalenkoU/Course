package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'c','h','a','r','s'};
        reverseString(chars);
        System.out.println(new String(chars));

        for (char c : chars) {
            System.out.println("-----");
            System.out.println("|:" + c + ":|");
        }
        System.out.println("-----");
    }

    public static void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        int l = 0;
        int r = s.length - 1;
        for (int i = l; i < r; i++) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
