package arrays.leetcode_explore.sort_by_parity;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,2,6,2,3,5,3,7,1,9,8};
        Solution.sortArrayByParity(nums);

        for(int num : nums) {
            System.out.print(num+", ");
        }
    }
}
