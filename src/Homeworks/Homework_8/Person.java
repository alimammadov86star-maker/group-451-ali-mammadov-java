package Homeworks.Homework_8;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void printNameLength() {
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null");
        }
    }
}