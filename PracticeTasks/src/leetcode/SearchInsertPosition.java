package leetcode;

public class SearchInsertPosition extends Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int[] nums = {1, 2, 3, 5, 7, 4};
        System.out.println(counter.linearSearchInsert(nums, 6));
    }
}

class Counter {
    public int linearSearchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public int binarySearchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
