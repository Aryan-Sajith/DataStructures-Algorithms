package arrays.greatest_value_on_the_right;

class GreatestValueOnRight {
    public static int[] replaceElements(int[] arr) {
        //maxVal = Tracks the maximum value from right to left and updates over time
        int cap = arr.length, maxVal = arr[cap-1];

        //Helps deal with arrays of capacity 1
        arr[cap - 1] = -1;
        if(cap == 1) {return arr;}

        //Start at cap-2 to ensure we don't worry about the last element
        for(int right=cap-2; right>=0; right--) {
            if(maxVal < arr[right]) {
                int temp = maxVal;
                maxVal = arr[right];
                arr[right] = temp;
                continue;
            }
            arr[right] = maxVal;
        }

        return arr;
    }

    //Time = O(N-1) = O(N)... We iterate from right to left once
    //Space = O(1)... In-place array modifications
}
