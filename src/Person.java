// Replace ___ with your code

import java.util.Scanner;

class Person {

    // create a private field

    private int age;

    // public method to get age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    // public method to set age


}

class NewMain {

    public static void main(String[] args) {

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // take user input
        int age = input.nextInt();

        // create object of Person class
        Person person = new Person();

        // set age using setAge()
        person.setAge(age);

        // print age using getAge()
        int newAge = person.getAge();
        System.out.println(newAge);
    }
}