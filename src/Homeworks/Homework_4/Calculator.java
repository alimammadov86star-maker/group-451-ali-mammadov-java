package Homeworks.Homework_4;

public class Calculator {
	 public static int sum(int a, int b) {
	        return a + b;
	    }

	    public static double average(double... numbers) {
	        if (numbers.length == 0) return 0;

	        double sum = 0;
	        for (double n : numbers) {
	            sum += n;
	        }
	        return sum / numbers.length;
	    }

	    public static void printMax(int... values) {
	        if (values.length == 0) {
	            System.out.println("Not numbers");
	            return;
	        }

	        int max = values[0];
	        for (int v : values) {
	            if (v > max) max = v;
	        }

	        System.out.println("Max number: " + max);
	    }
}