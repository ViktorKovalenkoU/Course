public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLast(5));
    }
    public static int sumFirstAndLast (int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = number % 10;

        while (number >= 10){
            number = number / 10;
        }
        int firstNumber = number;
        return firstNumber + lastNumber;
    }
}