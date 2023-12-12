/**
 * David Enriquez
 * CST-239
 * Assignment: CST-239 Activity 1 topic1-2
 * December 12, 2023
 * Citations(s):
 * Grand Canyon University CST-239 Activity 1 Guide
 */
package app;

/**
 * Person class which will represent a person
 * with attributes such as age, name, and weight
 */
public class Person {
    // class private member variables
    private int age;
    private String name;
    private float weight;

    /**
     * Constructs a Person object with specified
     * age, name, and weight
     * @param age age of person
     * @param name name of person
     * @param weight wight of person
     */
    public Person(int age, String name, float weight) {
        super();
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    /**
     * This method gets the
     * age of the person
     * @return returns age of person
     */
    public int getAge() {
        return age;
    }

    /**
     * This method gets the
     * name of the person
     * @return returns name of person
     */
    public String getName() {
        return name;
    }

    /**
     * This method gets the
     * wights of the person
     * @return returns weight of person
     */
    public float getWeight() {
        return weight;
    }

    /**
     * This method reflects the person walking
     */
    public void walk() {
        System.out.println("I am in walk()");
    }

    /**
     * This method reflects the person running
     * a certain distance
     * @param distance distance to run
     * @return returns distance
     */
    public float run(float distance) {
        System.out.println("I am in run()");
        return 0;
    }

    /**
     * This is the main method and entry point
     * of the application. We use this method
     * to reflect the Person class and the
     * functionality of the Person class
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person(25, "Bob", (float) 165.02);
        System.out.println("My name is " + person.getName());
        person.walk();
        person.run(10);
    }
}
