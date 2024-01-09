// Replace ___ with your code

import java.util.Scanner;

class SmallestAndLargest {

    public static int sumOfLargestAndSmallest(int[] numbers) {
        // initialize variables to keep track of the largest and smallest numbers
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // loop through the array to find the largest and smallest numbers
        for (int i = 0; i < numbers.length; i++) {
            // check if current element of array is greater than current value of largest variable
            if (numbers[i] > largest) {

                // update largest variable with current element
                largest = numbers[i];
            }
            // check if current element of array is smaller than current value of smallest variable
            if (numbers[i] < smallest) {

                //update smallest variable with current element
                smallest = numbers[i];
            }
        }

        // return the sum of the largest and smallest numbers
        return largest + smallest;
    }

    public static void main(String[] args) {
        // create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // take input for the array
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call sumOfLargestAndSmallest method
        // find the sum of largest and smallest numbers in the array
        int sum = sumOfLargestAndSmallest(numbers);

        // print the sum of largest and smallest numbers in the array
        System.out.println(sum);
    }
}