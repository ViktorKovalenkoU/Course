public class Test1 {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.609;
        long roundedMilesPerHour = Math.round(milesPerHour);

        return roundedMilesPerHour;
    }


    public static void printConversion(double kilometersPerHour) {

        long roundedMilesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + roundedMilesPerHour + " mi/h");
        }
    }
}
