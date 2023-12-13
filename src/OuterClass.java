public class OuterClass {

    private static String msg = "Hello World";

    public static class NestedStaticClass {

        public void printMessage() {
            System.out.println("Message from NestedStaticClass is : " + msg);
        }
    }

    public class InnerClass {

        public void display() {
            System.out.println("Message from Non-staticNestedClass : " + msg);
        }
    }
}

