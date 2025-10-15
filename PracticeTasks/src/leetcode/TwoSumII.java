package leetcode;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int[] numbers2 = {2, 3, 4};
        int[] numbers3 = {-1, 0};
        System.out.println(Arrays.toString(twoSum(numbers1, 9)));
        System.out.println(Arrays.toString(twoSum(numbers2, 6)));
        System.out.println(Arrays.toString(twoSum(numbers3, -1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
