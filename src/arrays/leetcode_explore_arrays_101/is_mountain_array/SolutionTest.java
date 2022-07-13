package arrays.leetcode_explore_arrays_101.is_mountain_array;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,4,5,7,7,3,2};

        if(Solution.validMountainArray(nums)) {
            System.out.println("The array nums is a mountain array!");
        }
        else{
            System.out.println("The array nums is not a mountain array ;(");
        }
    }
}
