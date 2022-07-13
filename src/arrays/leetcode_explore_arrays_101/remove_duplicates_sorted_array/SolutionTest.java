package arrays.leetcode_explore_arrays_101.remove_duplicates_sorted_array;


//This test should run without any exceptions caused by the assertions if the algorithm correctly modifies the
//original array and counts the number of unique non-duplicate values
public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,4,6,7,7,8,9,10,10,12}; // Input array
        int[] expectedNums = {0,1,4,6,7,8,9,10,12}; // Modified array without dups

        int uniqueVals = Solution.removeDuplicates(nums);

        assert uniqueVals == expectedNums.length;
        for (int i = 0; i < uniqueVals; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
