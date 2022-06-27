package Arrays.RemoveDuplicatesRandom;

public class RemoveDupsRandSolution {
    public static int removeDuplicates(int[] nums) {
        int slowPointer = 0;
        int cap = nums.length;

        if(cap == 0) return 0; //efficiently deals with empty array

        for(int fastPointer = 1; fastPointer < cap; fastPointer++) {
            if(nums[fastPointer] != nums[slowPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }
        }

        return slowPointer + 1;
    }

    //Time: O(N)
    //Space: O(1)
}
