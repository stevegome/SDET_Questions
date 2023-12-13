import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class arrayOfDistinctIntegers {
    /***
     * Given an array of distinct integers candidates  and a target integer target, return a list of all unique
     * combinations of candidates where the chosen numbers are sum to target.
     * Input : candidates = [5,2,3,1,4,7,6],
     * Target = 7
     * Output: [[5,2],[3,4,[1,6]]
     * @param arr
     * @param sum
     */

    public static void printDistinctIntegers(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<Integer>(); //this does not entertain duplicate values
        ArrayList<Integer[]> newArray = new ArrayList<Integer[]>();
        for (final int j : arr) {
            int temp = sum - j;

            // checking for condition
            if (s.contains(temp)) {
                newArray.add(new Integer[]{j, temp});
            }
            s.add(j); //this is going to run irrespective of any condition
        }
        System.out.println("New Array is : " + Arrays.deepToString(newArray.toArray()));
    }

    // Driver Code
    public static void main(String[] args) {
        int[] Candidates = {1, 4, 8, 2, 7, 6, 9, 12, 3};
        int target = 7;
        printDistinctIntegers(Candidates, target);
    }
}


