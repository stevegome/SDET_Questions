// Replace ___ with your code below

import java.util.Scanner;

class CountStringLength {

    // method to find the length of a String without using the length() method
    public static int lengthOfString(String text) {

        // convert the input String to a character array
        char[] textArray = text.toCharArray();

        // counter variable to count the number of characters
        int count = 0;

        // loop through each character of the String
        // increase the value of count for each iteration
        for (char c : textArray) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        // get input String
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text of your choice ---->");
        String text = input.nextLine();

        // call the lengthOfString method and print the result
        System.out.println(lengthOfString(text));
    }
}