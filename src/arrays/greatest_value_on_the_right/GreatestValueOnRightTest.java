package arrays.greatest_value_on_the_right;

public class GreatestValueOnRightTest {
    public static void main(String[] args) {
        int[] nums = {75,23,53,28,15,6,2,1};

        GreatestValueOnRight.replaceElements(nums);

        for(int num : nums) {System.out.println(num);}
    }
}
