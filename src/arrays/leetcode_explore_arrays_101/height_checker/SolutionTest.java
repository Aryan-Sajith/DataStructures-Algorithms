package arrays.leetcode_explore_arrays_101.height_checker;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        int[] sortedNums = {1,1,1,2,3,4};
        int numDifferentIndices = 3;

        if(Solution.heightChecker(nums) == 3) {
            System.out.println("The algorithm works!");
        }
        else {
            System.out.println("The algorithm failed!");
        }
    }
}
