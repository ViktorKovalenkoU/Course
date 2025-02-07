import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = sc.hasNextInt();
            if (!hasNextInt) {
                break;
            }
            int number = sc.nextInt();
            sum += number;
            count++;
            sc.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        sc.close();
    }
}
