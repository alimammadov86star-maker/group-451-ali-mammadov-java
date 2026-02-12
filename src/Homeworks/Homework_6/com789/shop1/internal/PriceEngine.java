package Homeworks.Homework_6.com789.shop1.internal;

import Homeworks.Homework_6.com456.shop.core.Product;

public class PriceEngine {

    public static double calculatePrice(Product p, double discountPercent) {
        double discount = p.price * discountPercent / 100.0;
        return p.price - discount;
    }
}