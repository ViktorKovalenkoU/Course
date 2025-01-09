public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int digit1, int digit2) {

        if(digit1 < 10 || digit1 >= 99 || digit2 < 10 || digit2 > 99){
            return false;
        }
//        if (digit1 < 10 || digit1 >= 99) {
//            return false;
//        } else if (digit2 < 10 || digit2 > 99) {
//            return false;
//        }
            int number1 = digit1 % 10;
            int number2 = (digit1 / 10) % 10;
            int number3 = digit2 % 10;
            int number4 = (digit2 / 10) % 10;
//            if(number1 == number3 || number1 == number4 || number2 == number3 || number2 == number4){
//                return true;
//            }
        return (number1 == number3 || number1 == number4 || number2 == number3 || number2 == number4);
//        return false;
    }
}
