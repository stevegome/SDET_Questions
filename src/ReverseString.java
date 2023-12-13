// Replace ___ with your code

import java.util.Scanner;

class ReverseString {

    public static String reverseString(String inputString) {
        // convert the input string to a character array
        // using the toCharArray() method
        char[] characterArray = inputString.toCharArray();

        // create a new empty string to store the reversed version of the input string
        String reversedString = "";

        // iterate through each character of the input string from the end to the beginning
        for (char c : characterArray) {
            // add the current element of characterArray to reversedString
            reversedString = c + reversedString;
        }

        return reversedString;
    }

    public static void main(String[] args) {
        // get an input string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // reverse the input string using reverseString() method
        String reversedString = reverseString(text);

        // print the reversed string
        System.out.println(reversedString);
    }
}