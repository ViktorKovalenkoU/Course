package leetcode.out;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(calc(" fly me  to  the moon "));
    }

    public static int calc(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}

