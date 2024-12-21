public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int inchesHeight){

        return inchesHeight * 2.54;
    }
    public static double convertToCentimeters(int heightInFeet, int inchesHeight){

        return convertToCentimeters((heightInFeet * 12) + inchesHeight);
    }

}