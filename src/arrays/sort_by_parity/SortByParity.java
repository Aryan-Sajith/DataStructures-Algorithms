package arrays.sort_by_parity;

public class SortByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int cap = nums.length, evenPointer = 0;

        // Edge cases
        if(cap == 0 || cap == 1 || nums == null) {return nums;}

        // Read the array from left to right. Utilizing the evenPointer,
        // we swap values when we encounter an even number to the front
        // of the array. This works because evenPointer is never greater
        // than readPointer, so worst case we swap elements back into
        // their original position.
        for(int readPointer = 0; readPointer < cap; readPointer++) {
            if(nums[readPointer] % 2 == 0) {
                int temp = nums[evenPointer];
                nums[evenPointer] = nums[readPointer];
                nums[readPointer] = temp;
                evenPointer++;
            }
        }

        return nums;
    }

    //Time Complexity: O(N) = We pass through the input array once
    //Space Complexity: O(1) = We make in-place array modifications
}
