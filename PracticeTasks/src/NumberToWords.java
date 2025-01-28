public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {

        int reverseNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reverseNumber);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0){
            System.out.println("Zero");
        }

        while (reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            reverseNumber /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        for (int i = reversedDigitCount; i < originalDigitCount; i++) {
            System.out.println("Zero");
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            reversed = reversed * 10 + lastNumber;
            number = number / 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        for (int i = number; i != 0; i = i / 10) {
            count++;
        }
        return count;
    }
}
