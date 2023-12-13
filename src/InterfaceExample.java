public class InterfaceExample implements MyInterface {

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.sample();
        obj.display();
    }

    public void sample() {
        System.out.println("Implementation of sample method");
    }
}
