// Replace ___ with your code below

import java.util.Scanner;

class MainSecondLargest {

    public static void main(String[] args) {

        // define an array
        int[] numbers = new int[5];

        // get input values for array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        // call the method by passing array as the input
        MainSecondLargest obj = new MainSecondLargest();
        int secondLargest = obj.findSecondLargest(numbers);

        // print the second largest element
        System.out.println(secondLargest);
    }

    // method to find the second largest element
    // takes an integer array as input
    int findSecondLargest(int[] no) {

        // variables to track the largest and second largest elements
        int largest, secondLargest;

        // initialize largest and second largest elements

        // with first and second elements making the comparison
        if (no[0] > no[1]) {
            largest = no[0];
            secondLargest = no[1];
        } else {
            largest = no[1];
            secondLargest = no[2];
        }

        // run a loop from the third element
        for (int i = 2; i < no.length; ++i) {

            // compare the element with largest and second largest
            // if the element is greater than largest,
            // assign largest to secondLargest and element to largest
            if (no[i] >= largest) {
                secondLargest = largest;
                largest = no[i];
            }
            // if element is greater than secondLargest but smaller than largest
            // assign the element to secondLargest
            else if (no[i] > secondLargest && no[i] < largest) {
                secondLargest = no[i];
            }
        }

        // return the second largest element
        return secondLargest;
    }
}