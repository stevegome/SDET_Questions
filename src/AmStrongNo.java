// Replace ___ with your code

import java.util.Scanner;

class AmStrongNo {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no --------->  ");
        int number = input.nextInt();

        // assign the number to another variable originalNumber
        int originalNumber = number;

        // sum variable to store the sum of cubes
        int sum = 0;

        // variable to access each digit of number
        int last_digit;

        // loop to find the cubes of each digit
        while (originalNumber != 0) {

            // use originalNumber % 10 to get the last digit
            last_digit = originalNumber % 10;
            // add the cube of the last digit to sum
            sum = sum + (last_digit * last_digit * last_digit);

            // use originalNumber / 10 to change the value of originalNumber
            originalNumber = originalNumber / 10;
        }

        // check if sum is equal to number
        String result = (sum == number) ? "Armstrong Number" : "Not an Armstrong Number";
        System.out.println(result);
        input.close();
    }
}