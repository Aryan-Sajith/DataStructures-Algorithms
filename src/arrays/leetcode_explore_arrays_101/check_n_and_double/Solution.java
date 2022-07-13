package arrays.leetcode_explore_arrays_101.check_n_and_double;

public class Solution {
    public static boolean checkIfExist(int[] arr) {
        int cap = arr.length;

        // Handles array edge cases
        if(arr == null || cap == 0) {
            return false;
        }

        // Checks if a multiple of 2 and it's halfValue are present in the array
        for(int i = 0; i < cap; i++) {
            if(arr[i] % 2 == 0) {
                for(int halfValFinder = 0; halfValFinder < cap; halfValFinder++) {
                    if(halfValFinder == i) {
                        continue;
                    }
                    if(arr[halfValFinder] * 2 == arr[i]) {
                        return true;
                    }
                }
            }

        }

        return false;
    }

    /*Time Complexity: O(N^2). No sorting and only using arrays.
      Space Complexity: O(1)
    */
}