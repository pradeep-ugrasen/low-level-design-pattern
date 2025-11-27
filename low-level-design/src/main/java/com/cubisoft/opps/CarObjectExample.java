package com.cubisoft.opps;

public class CarObjectExample {

    public static void main(String[] args) {
        // Creating objects of the Car class
        CarClassExample nexon = new CarClassExample("Tata", "nexon");
        CarClassExample creta = new CarClassExample("Hundai", "creta");

        nexon.accelerate(20);
        creta.accelerate(40);

        // Displaying status of each car
        nexon.displayStatus();
        System.out.println("-----------------");
        creta.displayStatus();
    }
}
