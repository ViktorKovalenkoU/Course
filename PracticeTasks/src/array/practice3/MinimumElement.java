package array.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] elements = readElements();
        findMin(elements);
        sc.close();
    }

    private static int readInteger() {
        System.out.println("How much elements do you need?");
        return sc.nextInt();
    }

    private static int[] readElements() {
        int len = readInteger();
        int[] elements = new int[len];

        System.out.println("Enter you integers:");
        for (int i = 0; i < len; i++) {
            elements[i] = sc.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.printf("Minimum array number is: %d%n", min);
        return min;
    }
}
