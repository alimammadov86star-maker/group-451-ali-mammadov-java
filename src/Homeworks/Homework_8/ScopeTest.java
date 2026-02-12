package Homeworks.Homework_8;

public class ScopeTest {

    public static void testScopes() {
        int x = 10;
        int y = 0;

        if (x > 5) {
            y = x * 2;
            System.out.println("y = " + y);
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
