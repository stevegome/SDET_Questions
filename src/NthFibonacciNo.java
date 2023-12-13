// Replace ___ with your code below
import java.util.Scanner;

class NthFibonacciNo {

    // define a recursive function
    public static int fib(int n) {

        // base case
        // if n is 1 or 0, return the number
        if (n ==1 || n == 0) {
            return n;
        }

        // return fib(n-1) + fib(n-2)
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        // take an int input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // call recursive function fib() and pass n
        int fibonacciNumber = fib(n);

        // print the fibonacci number
        System.out.println(fibonacciNumber);
    }
}




