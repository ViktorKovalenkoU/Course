public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Victor");

   /*     boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s); */

        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double result = (firstVariable + secondVariable) * 100.00;
        System.out.println("Result is = " + result);
        double remainder = result % 40.00;
        System.out.println("Remainder is = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    /*    boolean equal = true;
        if (remainder == 0.00) {
            System.out.println("True, result is 0.00");
        }
        else {
            System.out.println("False, not equal 0.00");
        }
        String isRemainder = (remainder != 0.00) ? "Remainder is true" : "Got some remainder";
        System.out.println(isRemainder); */
    }
}
