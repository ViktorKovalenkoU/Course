public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,6));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean rightTime = false;
        if (hourOfDay < 0) {
            rightTime = false;
        } else if (hourOfDay > 23) {
            rightTime = false;
        } else if (hourOfDay < 8) {
            rightTime = true;
        }else if (hourOfDay > 22) {
            rightTime = true;
        }
        return barking && rightTime;
    }
}