package arrays.mountain_array;

public class CheckMountainArraySolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,4,5,7,7,3,2};

        if(CheckMountainArraySolution.validMountainArray(nums)) {
            System.out.println("The array nums is a mountain array!");
        }
        else{
            System.out.println("The array nums is not a mountain array ;(");
        }
    }
}
