package Arrays.RemoveDuplicatesRandom;


//This test should run without any exceptions caused by the assertions if the algorithm correctly modifies the
//original array and counts the number of unique non-duplicate values
public class RemoveDupsRandTest {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,4,6,7,7,8,9,10,10,12}; // Input array
        int[] expectedNums = {0,1,4,6,7,8,9,10,12}; // Modified array without dups

        int uniqueVals = RemoveDupsRandSolution.removeDuplicates(nums);

        assert uniqueVals == expectedNums.length;
        for (int i = 0; i < uniqueVals; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
