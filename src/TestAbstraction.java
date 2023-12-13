// Replace ___ with your code

import java.util.Scanner;

// create an abstract class with an abstract method calculateArea()
abstract class PolygonTest {
    abstract void calculateArea();
}

// implement the Rectangle class from Polygon
class Rectangle extends PolygonTest {
    int length;
    int breadth;

    // constructor to initialize length and breadth
    // Hint: Use this keyword
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // implement the abstract method
    // compute the area and print it
    void calculateArea() {
        int area = length * breadth;
        System.out.println(area);
    }
}

class TestAbstraction {
    public static void main(String[] args) {

        // get input value for length and breadth
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();

        // create an object of Rectangle with length and breadth arguments
        Rectangle rect = new Rectangle(length, breadth);

        // call the calculateArea() method using the object
        rect.calculateArea();

        input.close();
    }
}




