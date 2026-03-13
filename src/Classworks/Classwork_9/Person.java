package Classworks.Classwork_9;

public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println("Привет, меня зовут " + name);
    }
}