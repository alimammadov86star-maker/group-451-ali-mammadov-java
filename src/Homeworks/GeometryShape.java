package Homeworks;

public class GeometryShape {
	double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    int area(int length, int width) {
        return length * width;
    }
}
