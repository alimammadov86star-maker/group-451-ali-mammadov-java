package Classworks.Classwork_9;

public class Student extends Person {

    String major;

    Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    @Override
    void introduce(){
        System.out.println("Привет, меня зовут " + name + ", моя специальность " + major);
    }
}	