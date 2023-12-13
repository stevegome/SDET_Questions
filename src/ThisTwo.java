//Using this() to invoke current class constructor
public class ThisTwo {
    int a;
    int b;

    ThisTwo() //default constructor
    {
        this(3, 4); // invokes current class constructor
    }

    ThisTwo(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(" a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        ThisTwo two = new ThisTwo();
    }

}
