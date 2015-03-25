package hw0327;
/**
 * Access Code 2.1
 * Ray Acevedo
 * Person.java
 */
//        You are provided with a Person class. This class has private fields name, phoneNumber and city, along with their
//        getter and setter methods.
//        Write a function called checkSameCity which accepts as input two Person instances and checks if they live in
//        the same city. The function should return a boolean value
//        A Person has recently had a child, whose name is 'Abc'. Write a function called registerChild which accepts as
//        input a Person instance(Parent) and returns a new Person instance for the child, which has the same phoneNumber
//        and city as the parent.

import java.util.PriorityQueue;

public class Person {

    private String name = "";
    private String city = "";
    private String pn = "";


    public Person(String name, String city, String pn) {
        this.name = name;
        this.city = city;
        this.pn = pn;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getPn() {
        return this.pn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public void setPn(String pn) {
        this.pn = pn;

    }

    public boolean checkSameCity(Person p1, Person p2) {
        return (p1.getCity().equalsIgnoreCase(p2.getCity()));


    }

    public static Person registerChild(Person parent) {
        Person child = new Person("Abc", parent.getCity(), parent.getPn());
        return child;
    }


    public static void main(String[] args) {
        Person bob =  new Person("bob", "Queens","3478224089");
        Person child = registerChild(bob);
        System.out.println(child.getCity());
    }
}



