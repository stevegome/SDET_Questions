// Replace ___ with your code below

import java.util.Scanner;

class countVowels {

    public static int testVowels(String text) {

        // convert the text string to lowercase
        String convertedString = text.toLowerCase();

        // initialize a counter variable
        int counter = 0;

        // loop through convertedString from the start of the string
        for (int i = 0; i < convertedString.length(); i++) {

            // use charAt() and check if letter at each index of convertedString
            // is either 'a', 'e', 'i', 'o', 'u'
            if (convertedString.charAt(i) == 'a' || convertedString.charAt(i) == 'e' || convertedString.charAt(i) == 'i' || convertedString.charAt(i) == 'o' || convertedString.charAt(i) == 'u') {

                // increase the counter variable by 1
                counter++;
            }
        }
        // return the counter variable
        return counter;
    }

    public static void main(String[] args) {

        // get input string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // call countVowels method and print the result
        int result = testVowels(text);
        System.out.println(result);
    }

}