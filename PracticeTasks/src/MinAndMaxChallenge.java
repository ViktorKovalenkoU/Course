import java.util.InputMismatchException;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number (0 to stop):");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("No numbers entered.");
            return;
        }

        int max = number;
        int min = number;

        while (number != 0) {
            try {
                System.out.println("Next number");
                number = sc.nextInt();

                if (number != 0) {
                    max = Math.max(max, number);
                    min = Math.min(min, number);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Wrong number, try again:");
                sc.nextLine();
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
