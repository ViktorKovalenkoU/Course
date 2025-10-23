package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,0,1,1};
        int[] nums3 = {1,2,3,1,2,3};

        System.out.println(containsNearbyDuplicate(nums1, 3));
        System.out.println(containsNearbyDuplicate(nums2, 1));
        System.out.println(containsNearbyDuplicate(nums3, 2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (map.containsKey(current)) {
                int prevIndex = map.get(current);
                if(i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(current, i);
        }
        return false;
    }
}
