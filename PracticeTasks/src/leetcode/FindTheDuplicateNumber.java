package leetcode;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int[] nums3 = {3,3,3,3,3};
        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
        System.out.println(findDuplicate(nums3));
    }

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
           slow = nums[slow];
           fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
