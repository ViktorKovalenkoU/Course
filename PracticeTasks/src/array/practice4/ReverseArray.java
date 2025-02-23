package array.practice4;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 6, 7, 4};
        reverse(array1);
    }

    private static void reverse(int[] array) {
        System.out.printf("Array: %s%n", Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("Sorted array: %s%n", Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.printf("Reversed array: %s%n", Arrays.toString(array));
    }
}
