package Homeworks.Homework_6.com123.graphics.app;

public interface Resizable {

    void resize(double factor);

    default void resizeTwice() {
        resize(2.0);
        logResize("increased by 2 times");
    }

    private void logResize(String message) {
        System.out.println("Лог: " + message + " " + System.currentTimeMillis());
    }
}
