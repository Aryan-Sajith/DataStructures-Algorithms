package arrays.leetcode_explore.merge_sorted_arrays;

class Solution {
    //The Time Complexity: O(M+N)
    //The Space Complexity: O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cap = m + n - 1;

        //we compare values from the two arrays with two pointers and fill in values
        //from the right
        for (int right = cap; right >= 0; right--) {
            //this means we've used all of nums2, so we stop
            if (n == 0) {
                break;
            }
            //this adds values from nums2 to nums1
            else if (m == 0 || nums2[n - 1] > nums1[m - 1]) {
                nums1[right] = nums2[n - 1];
                n--;
            }
            //this adds values from nums1 to nums1 because it's bigger or equal
            else {
                nums1[right] = nums1[m - 1];
                m--;
            }
        }
    }
}
