package arrays.leetcode_explore.remove_val;


public class RemoveValArrTest {
    public static void main(String[] args) {
        int[] nums = {1,4,6,2,0,13,6,12,42,21,23,6,6,2}; // original array
        int[] expectedNums = {1,4,2,0,13,12,42,21,23,2}; //array with val removed

        int output = RemoveValArrSolution.removeElement(nums, 6); //returns length of array after Val is deleted


        assert output == expectedNums.length;
        int nowSize = 0;
        for (int i = 0; i < output; i++) {
            nowSize++;
        }
        if(nowSize == expectedNums.length) {
            System.out.println("Your program has worked! The Val has been deleted");
        }
        else {
            System.out.println("Your program has failed! The Val has not been deleted");
        }
    }
}
