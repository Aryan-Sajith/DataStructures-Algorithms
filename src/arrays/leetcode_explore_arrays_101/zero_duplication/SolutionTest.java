package arrays.leetcode_explore_arrays_101.zero_duplication;
import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] test = {1,16,23,0,21,5,0,131,2,4,0,0,3,32};
        Solution.duplicateZeros(test);
        System.out.println(Arrays.toString(test));
    }
}
