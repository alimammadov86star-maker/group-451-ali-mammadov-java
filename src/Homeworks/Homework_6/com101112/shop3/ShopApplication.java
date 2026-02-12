package Homeworks.Homework_6.com101112.shop3;

import Homeworks.Homework_6.com456.shop.core.Product;
import Homeworks.Homework_6.com789.shop1.internal.PriceEngine;

public class ShopApplication {

    public static void main(String[] args) {

        Product p = new Product(1, "Laptop", 2000);

        double discounted =
                PriceEngine.calculatePrice(p, 10);

        System.out.println("Price with sale: " + discounted);
    }
}
