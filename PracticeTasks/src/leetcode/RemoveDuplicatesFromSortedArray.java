package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(noDuplicates(new int[] {1,1,1,2,2,3,4,5,5}));
    }

    public static int noDuplicates (int[] nums) {

        if (nums.length == 0) return 0;

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
