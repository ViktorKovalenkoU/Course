public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        boolean trueLeapYear = false;

        int leap1 = year % 4;
        int leap2 = year % 100;
        int leap3 = year % 400;

        if (year >= 1 && year <= 9999) {
            if (leap1 == 0 && leap2 != 0) {
                trueLeapYear = true;
            } else if (leap2 == 0 && leap3 == 0) {
                trueLeapYear = true;
            } else if (leap2 == 0 && leap3 != 0) {
                trueLeapYear = false;
            }
        }
        return trueLeapYear;
    }
}