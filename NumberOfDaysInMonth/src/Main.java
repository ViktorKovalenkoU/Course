public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
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
    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 1:
                int day1 = 31;
               return day1;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }
                int day2 = 28;
                return day2;
            case 3:
                int day3 = 31;
                return day3;
            case 4:
                int day4 = 30;
                return day4;
            case 5:
                int day5 = 31;
                return day5;
            case 6:
                int day6 = 30;
                return day6;
            case 7:
                int day7 = 31;
                return day7;
            case 8:
                int day8 = 31;
                return day8;
            case 9:
                int day9 = 30;
                return day9;
            case 10:
                int day10 = 31;
                return day10;
            case 11:
                int day11 = 30;
                return day11;
            case 12:
                int day12 = 31;
                return day12;
        }
        return 0;
    }
}

//public class NumberOfDaysInMonth {
//
//    public static int getDaysInMonth(int month, int year) {
//
//        if (year < 1 || year > 9_999) {
//            return -1;
//        }
//
//        return switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
//            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
//            case 4, 6, 9, 11 -> 30; // return 30 for the following months
//            default -> -1; // return -1 if the month parameter is not between 1 and 12.
//        };
//    }
//
//    public static boolean isLeapYear(int year) {
//
//        if (year < 1 || year > 9_999) {
//            return false;
//        }
//
//        if (year % 4 == 0) {
//            if (year % 100 != 0) {
//                return true;
//            } else {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } else {
//            return false;
//        }
//    }
//}
