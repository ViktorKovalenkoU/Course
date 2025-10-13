package leetcode;

public class RangeSumQuery {
    static int[] prefixSum;

    public static void main(String[] args) {
        prefixSum = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray(prefixSum);
        System.out.println(sumRange(0, 2));
        System.out.println(sumRange(2, 5));
        System.out.println(sumRange(0, 5));
    }

    public static void NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public static int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
