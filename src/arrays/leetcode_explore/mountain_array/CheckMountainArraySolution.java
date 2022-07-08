package arrays.leetcode_explore.mountain_array;

public class CheckMountainArraySolution {
    public static boolean validMountainArray(int[] arr) {
        int cap = arr.length, i = 0;

        //this immediately disqualifies invalid array inputs
        if(cap < 3 || arr == null) {
            return false;
        }

        //this disqualifies non-increasing arrays at the start
        if(arr[0] >= arr[1]) {return false;}

        //we traverse the array in separate loops because a single loop
        //is hard to determine when the peak occurs in concise logic
        //
        //here we climb up the mtArray
        while(i+1 < cap && arr[i] < arr[i+1]) {i++;}

        //this is to ensure our peak doesn't occur at the beginning or the end
        if(i == 0 || i == cap-1) {return false;}

        //here we climb down the mtArray
        while(i+1< cap && arr[i] > arr[i+1] ) {i++;}

        //if we reached the end of the array, then we have traversed a mountain array... this
        //would imply that i == cap - 1
        return i == cap - 1;
    }
}
