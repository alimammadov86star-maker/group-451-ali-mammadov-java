package Classworks.Classwork_7;

public class Student {
    String name;
    int age;
    double averageGrade;

    Student(String name, int age, double avg) {
        this.name = name;
        this.age = age;
        this.averageGrade = avg;
    }

    boolean isExcellent() {
        return averageGrade >= 90;
    }

    void print() {
        System.out.println(name + ", " + age + " лет, средний балл: " + averageGrade +
                (isExcellent() ? " (Отличник)" : " (Обычный студент)"));
    }
}