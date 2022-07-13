package arrays.leetcode_explore_arrays_101.height_checker;

import java.util.Arrays;

public class Solution {
    public static int heightChecker(int[] heights) {
        int cap = heights.length;
        int[] sortedHeights = Arrays.copyOf(heights, cap);
        int mismatches = 0;

        Arrays.sort(sortedHeights);

        for(int i = 0; i < cap; i++) {
            if(heights[i] != sortedHeights[i]) {mismatches++;}
        }

        return mismatches;
    }

    //Time Complexity = O(NLogN) --> Java's Arrays.sort() has O(NLogN) time complexity
    //Space Complexity = O(n) --> We created another array with size n
}
