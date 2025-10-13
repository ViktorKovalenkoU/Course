package learn.prefix_sum_pattern;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5};
        int[] result = prefixSumOfArrayElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] prefixSumOfArrayElements(int[] arr) {
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
