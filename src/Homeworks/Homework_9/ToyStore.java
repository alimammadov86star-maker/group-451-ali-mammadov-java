package Homeworks.Homework_9;

public class ToyStore {

    public static long roundPrice(double price) {
        return Math.round(price);
    }

    public static void main(String[] args) {

        double[] prices = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};

        System.out.println("Prices in the toy store:");

        double sumPrices = 0.0;

        for (double price : prices) {

            long roundedPrice = roundPrice(price);

            System.out.println("Toy: " + price + "after rounding: " + roundedPrice);

            sumPrices += price;
        }

        double average = sumPrices / 10;
        long roundedAverage = Math.round(average);

        System.out.println("Average price  " + roundedAverage);
    }
}
