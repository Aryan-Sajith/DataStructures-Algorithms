package arrays.leetcode_explore.greatest_value_on_the_right;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {75,23,53,28,15,6,2,1};

        Solution.replaceElements(nums);

        for(int num : nums) {System.out.println(num);}
    }
}
