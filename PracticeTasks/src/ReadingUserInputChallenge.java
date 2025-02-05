import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int sum = 0;
        while (x <= 5) {
            System.out.println("Enter number #" + x + ":");
            try {
                int number = sc.nextInt();
                if (number <= 0) {
                    System.out.println("Invalid number");
                    sc.nextLine();
                    continue;
                }
                sum += number;
            } catch (InputMismatchException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
                sc.nextLine();
            }
            x += 1;
        }
        System.out.println("Sum: " + sum);
    }
}
