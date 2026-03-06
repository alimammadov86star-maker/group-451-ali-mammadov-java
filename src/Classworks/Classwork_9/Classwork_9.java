package Classworks.Classwork_9;

import java.util.ArrayList;

public class Classwork_9 {

	    public static void main(String[] args) {

	    	// 1
	        int a = 5;
	        int b = 3;
	        System.out.println("Sum: " + (a + b));

	        // 2
	        int number = 4;
	        System.out.println("Is even: " + (number % 2 == 0));

	        // 3
	        for(int i = 1; i <= 10; i++){
	            System.out.println(i);
	        }

	        // 4
	        int[] arr = {3,7,2,9,5};
	        int max = arr[0];

	        for(int num : arr){
	            if(num > max){
	                max = num;
	            }
	        }

	        System.out.println("Max: " + max);


	        // 8 
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Ali");
	        names.add("Veli");
	        names.add("Murad");

	        for(String name : names){
	            System.out.println(name);
	        }

	    }
	}