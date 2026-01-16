package Homeworks;

import java.util.Arrays;

public class Homework_2 {
	public static void main(String[] args) {

		int[] arr123 = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr123));

		int[] arr456 = Arrays.copyOf(arr123, 6);
		System.out.println(Arrays.toString(arr456));

		Arrays.fill(arr456, 3, arr456.length, 5);
		System.out.println(Arrays.toString(arr456));

		int[] numbers = { 10, 20, 30, 40, 50 };
		int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
		System.out.println(Arrays.toString(subArray));

		String[] words = { "Hi", "Hello", "World" };
		System.out.println(Arrays.toString(words));

		char[] symbols = new char[5];
		Arrays.fill(symbols, '*');
		System.out.println(Arrays.toString(symbols));

		int[] searchArr = { 9, 3, 7, 1, 5 };
		Arrays.sort(searchArr);
		System.out.println(Arrays.toString(searchArr));

		int index = Arrays.binarySearch(searchArr, 7);
		System.out.println(index);

		String[] arr1 = { "A", "B", "C" };
		String[] arr2 = { "A", "B", "C" };
		System.out.println(Arrays.equals(arr1, arr2));

		String[] fruits = { "Apple", "Banana", "Orange" };
		boolean exists = Arrays.asList(fruits).contains("Banana");
		System.out.println(exists);

		int[] original = { 100, 200, 300 };
		int[] cloned = original.clone();

		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(cloned));
	}
}
