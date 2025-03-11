package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000000001));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(2));
    }

    public static boolean isPalindrome(int x) {
        long number = x;
        long reversedNumber = 0;
        while (number > 0) {
            long lastNumber = number % 10;
            number /= 10;
            reversedNumber = (reversedNumber + lastNumber) * 10;
        }
        if (reversedNumber / 10 == x){
            return true;
        }
        return false;
    }
}