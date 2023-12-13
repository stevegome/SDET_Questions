// Replace ___ with your code below 

import java.util.Scanner;

class Factorials {

    public static void main(String[] args) {

        // get input value for the number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // call the findFactorial() method
        Factorials obj = new Factorials();
        int result = obj.findFactorial(number);

        System.out.println(result);
    }

    // method to find the factorial of a number
    int findFactorial(int number) {
        // variable to store the factorial
        int factorial = 1;
        // if the number is either 0 or 1, return 1 as the factorial
        if (number == 0 || number == 1) {
            return factorial;
        }


        // loop through the integers from number to 1
        for (int i = number; i > 1; i--) {

            // multiply each value with factorial
            factorial = factorial * i;
        }
        // return factorial
        return factorial;
    }
}