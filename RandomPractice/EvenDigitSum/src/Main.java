public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return  -1;
        }
        int sum = 0;
        while (number >= 1) {
            int lastNumber = number % 10;
            int evenNumber = lastNumber % 2;
            if (evenNumber == 0){
                sum += lastNumber;
            }
            number = number / 10;
        }
        return sum;
    }
}