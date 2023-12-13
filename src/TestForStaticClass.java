public class TestForStaticClass {

    public static void main(String args[]) {
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMessage();


        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.display();

    }
}
