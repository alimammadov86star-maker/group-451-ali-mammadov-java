package Homeworks.Homework_4;

public class Student {
	String name;
    int age;
    double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    void printInfo() {
        System.out.println("Name:" + name + 
                           ", Age: " + age + 
                           ", Average: " + averageGrade);
    }
}
