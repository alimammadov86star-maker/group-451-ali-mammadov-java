package Homeworks.Homework_8;

public class Box {
    int value;

    public Box(int value) {
        this.value = value;
    }

    public static void changeValue(Box b) {
        b.value = 100;
    }
}