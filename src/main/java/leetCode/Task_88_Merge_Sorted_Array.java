package leetCode;

import java.util.Arrays;

public class Task_88_Merge_Sorted_Array {
    public static void main(String[] args) {
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (!(nums1.length == m)) {
            int index = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[index];
            }
            Arrays.sort(nums1);
        }
    }
}
