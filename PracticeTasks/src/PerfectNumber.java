public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int i = 1;
        if (number < 1) {
            return false;
        }
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == number;
    }
}
