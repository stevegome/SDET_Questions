//Using ‘this’ keyword to return the current class instance
public class ThisThree {
    int a, b;

    ThisThree() //default constructor
    {
        a = 10;
        b = 20;
    }

    public static void main(String[] args) {
        ThisThree three = new ThisThree();
        three.get().display();
    }

    ThisThree get() {
        return this;
    }

    void display() {
        System.out.println(" a = " + a + " b = " + b);
    }

}
