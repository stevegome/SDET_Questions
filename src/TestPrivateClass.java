class TestPrivateClass {

    private class Stevan {
        public void display() {
            System.out.println("this is inner display");
        }
    }

    void display() {
        System.out.println("This is outer display");
        Stevan s = new Stevan();
        s.display();

    }
}

