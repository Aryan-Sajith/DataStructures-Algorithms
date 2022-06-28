package arrays.remove_val;

public class RemoveValArrSolution {
    public static int removeElement(int[] nums, int val) {
        int i = 0, length = nums.length;

        //while loop bc we won't move on from curr index
        //until we're sure it's non-val
        while(i<length) {
            if(nums[i] == val){
                nums[i] = nums[length-1];
                length--;
            }
            else {
                i++;
            }
        }
        return i;
    }
    //Time Complexity: O(N) if  we remove all values
    //Space Complexity: O(1) bc no extra memory
}
