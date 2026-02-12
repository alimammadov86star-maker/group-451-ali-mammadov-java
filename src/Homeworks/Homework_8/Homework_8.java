package Homeworks.Homework_8;

public class Homework_8 {
    public static void main(String[] args) {

        // 1
        Person p1 = new Person("Alex");
        p1.printNameLength();

        Person p2 = new Person(null);
        p2.printNameLength();

        // 2
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("c1: total=" + c1.totalCount + ", instance=" + c1.instanceCount);
        System.out.println("c2: total=" + c2.totalCount + ", instance=" + c2.instanceCount);
        System.out.println("c3: total=" + c3.totalCount + ", instance=" + c3.instanceCount);

        // 3
        System.out.println(TypeTest.sumNumbers(5, 2.5));
        System.out.println(TypeTest.sumNumbers(10, 3));

        // 4
        Box box = new Box(10);
        Box.changeValue(box);
        System.out.println(box.value);

        // 5
        ScopeTest.testScopes();
    }
}
