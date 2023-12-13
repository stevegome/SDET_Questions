// Replace ___ with your code

import java.util.Scanner;

interface Polygon {
    // abstract method
    double getArea(double base, double height);
}

// implement Polygon
class Triangle implements Polygon {

    // provide implementation for getArea
    // compute area using the formula on description and print it
    public double getArea(double base, double height) {
        return 0.5 * base * height;
    }

}

class TriangleMain {
    public static void main(String[] args) {

        // object of Triangle class
        Triangle obj = new Triangle();

        // take input value for base and height
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        // find the area of triangle
        System.out.println(obj.getArea(base, height));
    }
}