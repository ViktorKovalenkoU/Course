package leetcode;

public class RangeSumQuery {
    static int[] nums;
    public static void main(String[] args) {
        nums = new int[]{-2,0,3,-5,2,-1};
        NumArray(nums);
        System.out.println();
        System.out.println(sumRange(0,2));
        System.out.println(sumRange(2,5));
        System.out.println(sumRange(0,5));
    }

    public static void NumArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
