package Homeworks.Homework_6.com123.graphics.app;

public class Image implements Resizable {

    double width = 100;
    double height = 80;

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Image resized: " + width + " x " + height);
    }
}
