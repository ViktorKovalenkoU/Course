package leetcode;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0}));
    }

    public static int findMaxLength(int[] nums) {
        int maxL = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int length = i - prevIndex;
                if (length > maxL) {
                    maxL = length;
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxL;
    }
}
