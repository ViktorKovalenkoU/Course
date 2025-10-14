package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
    }

    public static int maxArea(int[] height) {
        int right = height.length - 1, left = 0,
                max = 0;
        while (left < right){
                int area = Math.min(height[left], height[right]) * (right - left);
                max = Math.max(max, area);
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
