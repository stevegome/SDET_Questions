import java.util.Scanner;

public class SwapNoWithoutThirdVar {
    public static void swapNumbers(int num1, int num2) {
        // add two numbers and store the result in num1
        num1 = num1 + num2;

        // assign the original value of num1 to num2
        // subtract num2 from num1 and store it in num2
        num2 = num1 - num2;

        // assign the original value of num2 to num1
        // subtract num2 from num1 and store it in num1
        num1 = num1 - num2;

        // print the values of num1 and num2
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        // take two integer input
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // call the swapNumbers method to swap the two numbers
        swapNumbers(number1, number2);
    }
}
