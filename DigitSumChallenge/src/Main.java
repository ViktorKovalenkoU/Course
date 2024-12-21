public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(-125));
    }
    public static int sumDigits (int number) {

        int sum = 0;

        if (number >= 0) {
            do {
                sum += (number % 10);
                number /= 10;
            } while (number > 9);
            sum += number;

            return sum;
        }
        return -1;
    }
}