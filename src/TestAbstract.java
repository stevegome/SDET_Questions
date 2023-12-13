public abstract class TestAbstract {

    public void start() { // non-abstract methods can be implemented
        System.out.println("start the game");
    }

    public void stop() {  // non-abstract methods can be implemented
        System.out.println("stop the game");
    }

    public abstract void haveFun(); // abstract  methods can only be declared, not implemented
}
