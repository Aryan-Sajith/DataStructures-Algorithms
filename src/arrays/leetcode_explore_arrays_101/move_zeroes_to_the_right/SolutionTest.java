package arrays.leetcode_explore_arrays_101.move_zeroes_to_the_right;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {0,5,23,0,0,2,54,2,0,1,3};
        Solution.moveZeroes(nums);

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
