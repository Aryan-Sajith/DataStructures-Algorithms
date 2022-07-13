package arrays.leetcode_explore_arrays_101.max_consecutive_ones;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums)  {
        int cap = nums.length;
        int prev = 0, curr = 0;
        int maxOnes = 0;

        // Edge cases to consider
        switch(cap){
            case(0):
                return 0;
            case(1):
                return 1;
        }
        if(nums == null) {return 0;}

        // Iterates and tracks sequence of ones before seeing a zero and after seeing a zero
        for(int i = 0; i < cap; i++) {
            if(nums[i] == 0) {
                prev = curr + 1; // curr+1 because we also want to count the zero
                curr = 0;
            }
            else {curr++;}
            maxOnes = Math.max(maxOnes,curr+prev);
        }

        return maxOnes;
    }

    // Time Complexity = O(N) because we iterate the array once
    // Space Complexity = O(1) because we only utilize a few variables
}
