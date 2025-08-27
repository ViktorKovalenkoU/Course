public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces (double firstDouble, double secondDouble){

        double number1 = (short)(firstDouble*1000)/1000d;
        double number2 = (short)(secondDouble*1000)/1000d;

        if (number1 == number2) {
            return true;
        } else if (number1 != number2) {
            return false;
        }
        return true;
    }
}