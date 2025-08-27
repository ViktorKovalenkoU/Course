public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (isValid(number1) && isValid(number2) && isValid(number3)) {

            int lastNumber1 = number1 % 10;
            int lastNumber2 = number2 % 10;
            int lastNumber3 = number3 % 10;

            if (lastNumber1 == lastNumber2 || lastNumber2 == lastNumber3 || lastNumber1 == lastNumber3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}