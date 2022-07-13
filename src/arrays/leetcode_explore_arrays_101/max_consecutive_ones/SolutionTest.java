package arrays.leetcode_explore_arrays_101.max_consecutive_ones;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0};
        int correctAnswer = 4;

        if(Solution.findMaxConsecutiveOnes(nums) == correctAnswer) {
            System.out.println("The algorithm works!");
        }
        else {
            System.out.println("The algorithm failed ;(");
        }
    }
}
