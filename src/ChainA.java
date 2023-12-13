public class ChainA {
    private int a;
    private float b;

    ChainA() {
        System.out.println("Calling Constructor");
    }

    public static void main(String[] args) {
        new ChainA().setInt(10).setFloat(20).display();
    }

    public ChainA setInt(int a) {
        this.a = a;
        return this;
    }

    public ChainA setFloat(float b) {
        this.b = b;
        return this;
    }

    public void display() {
        System.out.println("Display : " + a + " " + b);
    }

}
