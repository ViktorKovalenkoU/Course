package array.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        int[] sortIntegers = sortIntegers(myArray);
        printArray(sortIntegers);
    }

    public static int[] getIntegers(int len) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[len];
        System.out.println("Enter " + len + " integer values:\r");
        for (int i = 0; i < len; i++) {
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Element %d contents %d%n", i, myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] myArray) {
        int[] sortedIntegers = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(sortedIntegers);
        System.out.println(Arrays.toString(sortedIntegers));
        for (int i = 0; i < sortedIntegers.length / 2; i++) {
            int temp = sortedIntegers[i];
            sortedIntegers[i] = sortedIntegers[sortedIntegers.length - 1 - i];
            sortedIntegers[sortedIntegers.length - 1 - i] = temp;
        }
        return sortedIntegers;
    }
}
