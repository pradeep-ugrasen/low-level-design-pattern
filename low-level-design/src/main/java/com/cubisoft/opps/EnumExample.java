package com.cubisoft.opps;

public class EnumExample {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPED;

        if (status == OrderStatus.SHIPPED) {
            System.out.println("Your package is on the way!");
        }

        int total = Coin.DIME.getValue() + Coin.QUARTER.getValue(); // 35
        System.out.println("Total :: "+ total);
    }
}
