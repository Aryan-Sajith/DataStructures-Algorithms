package arrays.leetcode_explore_arrays_101.merge_sorted_arrays;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums1 = {1,6,12,13,0,0,0};
        int m = 4;
        int[] nums2 = {3,7,9};
        int n = 3;

        Solution.merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));
    }
}
