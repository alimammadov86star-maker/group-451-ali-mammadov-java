package Homeworks;

public class Student {
	String name;
	String surname;
	int age;
	double averageGrade;

	Student(String name, String surname, int age, double averageGrade) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.averageGrade = averageGrade;
	}

	void printInfo() {
		System.out.println(name + " " + surname + ", Age: " + age + ", Avg: " + averageGrade);
	}
}