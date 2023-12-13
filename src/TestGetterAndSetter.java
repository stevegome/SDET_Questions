class TestGetterAndSetter {
    private String name;

    // setter method
    public void setName(String name) {

        //this.name here refers the private variable "name"
        this.name = name;
    }

    // getter method
    public String getName() {
        return this.name;
    }
}

class GetterSetterMain {

    public static void main(String[] args) {

        // create objects of Student class
        TestGetterAndSetter student1 = new TestGetterAndSetter();

        // assign value using the setter method
        student1.setName("Alex");

        // access the value using getter
        String name = student1.getName();
        System.out.println("Name: " + name);
    }
}