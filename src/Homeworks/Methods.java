package Homeworks;

public class Methods {

    // 4️
    public static int rectangleArea(int length, int width) {
        return length * width;
    }

    // 5
    public static double average(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }

    // 6
    public static void greeting(String name, int age) {
        System.out.println("Hi " + name + ", your age is " + age);
    }

    // 8
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 10
    public static int square(int n) {
        return n * n;
    }

    // 12
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // 13
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
        	return true;
        }
        else {
        	return false;
        }
    }

    // 14
    public static String season(int month) {
        if (month == 12 || month == 1 || month == 2)
            return "Winter";
        else if (month >= 3 && month <= 5)
            return "Spring";
        else if (month >= 6 && month <= 8)
            return "Summer";
        else if (month >= 9 && month <= 11)
            return "Autumn";
        else
            return "Invalid month";
    }
}
