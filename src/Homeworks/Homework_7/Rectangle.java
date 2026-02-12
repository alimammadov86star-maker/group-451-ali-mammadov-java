package Homeworks.Homework_7;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public Rectangle scale(double factor) {
        return new Rectangle(width * factor, height * factor);
    }
}
