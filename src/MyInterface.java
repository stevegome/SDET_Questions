public interface MyInterface {
    public void sample();
    default public void display(){
        System.out.println("Default implementation of the display method");
    }

}
