package Homeworks.Homework_8;

public class Counter {
    static int totalCount = 0;
    int instanceCount = 0;

    public Counter() {
        totalCount++;
        instanceCount++;
    }
}
