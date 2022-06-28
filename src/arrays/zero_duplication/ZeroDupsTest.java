package arrays.zero_duplication;
import java.util.Arrays;

public class ZeroDupsTest {
    public static void main(String[] args) {
        int[] test = {1,16,23,0,21,5,0,131,2,4,0,0,3,32};
        ZeroDupsSolution.duplicateZeros(test);
        System.out.println(Arrays.toString(test));
    }
}
