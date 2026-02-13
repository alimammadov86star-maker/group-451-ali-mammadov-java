package Homeworks.Homework_9;

public class Shapes {

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        double[] sides = {5, 8, 3, 10, 6};

        System.out.println("Areas of squares:");

        double maxArea = 0;

        for (double side : sides) {

            double area = squareArea(side);
            System.out.println("Side: " + side + " → Area: " + area);

            maxArea = Math.max(maxArea, area);
        }

        double[][] rectangles = {
                {4, 6},
                {7, 3},
                {9, 2},
                {5, 5}
        };

        System.out.println("Areas of rectangles:");

        for (double[] rectangle : rectangles) {

            double area = rectangleArea(rectangle[0], rectangle[1]);

            System.out.println("Length: " + rectangle[0] +
                    ", Width: " + rectangle[1] +
                    " → Area: " + area);

            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Largest area: " + maxArea);
    }
}
