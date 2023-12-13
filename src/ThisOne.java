//Using ‘this’ keyword to refer current class instance variables
public class ThisOne {
    int a, b;

    ThisOne(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ThisOne one = new ThisOne(3, 4);
        one.display();

    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
}
