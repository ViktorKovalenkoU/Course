public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1001));
    }
    public static boolean isPalindrome (int number) {
        int digit = number;
        int reverse = 0;
        while (number != 0 || number > 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse = reverse * 10;
            number = number / 10;
        }

        if(digit == reverse / 10){
            return true;
        }
        return false;
    }
}