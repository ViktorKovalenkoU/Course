package leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 6;
        int n = 8;
        int[] nums1 = new int[m + n];
        int[] original = {1,3,5,2,4,6};
        System.arraycopy(original, 0, nums1, 0, m);

        int[] nums2 = {4, 5, 3, 2, 6, 1, 7, 8};
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
