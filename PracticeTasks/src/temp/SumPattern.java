package temp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumPattern {
    public static void main(String[] args) {
    int[] arr = {3,1,4,5,2};
    int[] result = prefixSumOfArrayNumbers(arr);

    System.out.println("Sum of prefixes in array: " + Arrays.toString(result));

    System.out.println("Sum of range of numbers in array by index: " + sumOfArrayRange(arr,4,5));
    }

    public static int[] prefixSumOfArrayNumbers(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int sumOfArrayRange(int[] arr, int aIndex, int bIndex) {
        int range = bIndex - aIndex + 1;
        int sum = 0;
        if(aIndex > bIndex || aIndex >= arr.length || bIndex >= arr.length || aIndex < 0) {
            return -1;
        } else if (aIndex == bIndex) {
            return Array.getInt(arr,aIndex);
        } else {
            for (int i = aIndex; i <= range; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
