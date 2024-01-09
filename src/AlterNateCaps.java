// Replace ___ with your code below 

import java.util.Scanner;

class AlterNateCaps {

    static void toggleString(String text) {
        // initialize an empty result named toggledString
        String toggledString = "";

        // loop through each character in text
        for (int i = 0; i < text.length(); i++) {

            // get current character of text
            char currentCharacter = text.charAt(i);

            // check if currentCharacter is an uppercase or not
            // convert it to it's opposite case and add it to toggledString
            if (Character.isUpperCase(currentCharacter)) {

                toggledString = toggledString + Character.toLowerCase(currentCharacter);
            } else {

                toggledString = toggledString + Character.toUpperCase(currentCharacter);
            }
        }
        // print toggledString
        System.out.println(toggledString);
    }

    public static void main(String[] args) {

        // take an int input
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // toggle text
        toggleString(text);

    }
}