package arrays.move_zeroes_to_end;

public class MoveZeroesEndTest {
    public static void main(String[] args) {
        int[] nums = {0,5,23,0,0,2,54,2,0,1,3};
        MoveZeroesEnd.moveZeroes(nums);

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
