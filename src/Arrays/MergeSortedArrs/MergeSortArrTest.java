package Arrays.MergeSortedArrs;

import java.util.Arrays;

public class MergeSortArrTest {
    public static void main(String[] args) {
        int[] nums1 = {1,6,12,0,0,0};
        int m = 3;
        int[] nums2 = {3,7,9};
        int n = 3;

        MergeSortArrSolution.merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));
    }
}
