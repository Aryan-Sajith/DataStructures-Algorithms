package arrays.leetcode_explore_arrays_101.zero_duplication;

/*An efficient algorithm to duplicate the zeroes present in an array in java
 1.Count the number of zeroes that need extra space in the array. O(N)
 2.Deal with the edge case of a zero at the end of the array
   which we don't duplicate since we are at the end. O(1)
 3.Reiterate through the array from the right side to prevent
   data loss when duplicating zeroes. O(N)

    Time Complexity: O(N). Worst case we have to go through entire array full of zeroes.
    Space Complexity: O(1). We don't utilize any memory for another array

 */
class Solution {
    public static void duplicateZeros(int[] arr) {
        int zeroDups = 0, cap = arr.length - 1, last;

        //this loop determines potential duplicable zeroes.
        //We use cap-zeroDups to determine how much we iterate
        //with consideration of the space taken by duplicate zeroes
        for (int left = 0; left <= cap - zeroDups; left++) {
            if (arr[left] == 0) {
                //the last zero, so we avoid duplication and reduce the
                // the iteration length for the next run through
                if (left == cap - zeroDups) {
                    arr[cap] = 0;
                    cap--;
                    break;
                }
                zeroDups++;
            }
        }


        //now we iterate backwards to remodify our array
        //we add back zeroDups bc we're assigning values back
        //to the full array and we initally took away zeroDups
        //when we started
        last = cap - zeroDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeroDups] = 0;
                zeroDups--;
                arr[i + zeroDups] = 0;
            } else {
                arr[i + zeroDups] = arr[i];
            }
        }
    }
}

