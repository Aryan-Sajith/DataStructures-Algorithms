package arrays.leetcode_explore.move_zeroes_to_the_right;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int writerIndex = 0, cap = nums.length;

        //edge cases with bad input arrs
        if(cap == 0 || nums == null) {return;}

        //Iterates through entire array once, if a non-zero value is found
        //we can then read the values at readerIndex into writerIndex bc
        //writerIndex is never greater than readerIndex
        for(int readerIndex = 0; readerIndex < cap; readerIndex++) {
            if(nums[readerIndex] != 0) {
                int temp = nums[writerIndex];
                nums[writerIndex] = nums[readerIndex];
                nums[readerIndex] = temp;
                writerIndex++;
            }
        }
    }

    //Time Complexity: O(N) We read through array once
    //Space Complexity: O(1) We don't utilize any extra memory
}
