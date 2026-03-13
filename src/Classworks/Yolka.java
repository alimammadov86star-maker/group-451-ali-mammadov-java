package Classworks;

public class Yolka {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
        	
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}