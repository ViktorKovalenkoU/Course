public class Main {
    public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        int hour = 60;
        int day = 24;
        int year = 365;

        long calculatedHours = minutes / hour;
        long modulusCalculatedHours = calculatedHours % day;

        long calculatedDays = calculatedHours / day;
        long modulusCalculatedDays = calculatedDays % year;

        long calculatedYears = calculatedDays / year;
        System.out.println(minutes + " min = " + calculatedYears + " y and " + modulusCalculatedDays + " d");
    }
}