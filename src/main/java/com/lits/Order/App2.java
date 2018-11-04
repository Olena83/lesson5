package com.lits.Order;



public class App2 {
    public static void main(String[] args) {
    PizzaOrder pizza =new PizzaOrder();
    pizza.setPrise(3);
    pizza.setWeight(100);
    System.out.println( pizza.calculateTotalPrice());

        AppleOrder apple =new AppleOrder();
        apple.setPrise(15);
        apple.setQuantity(10);
        System.out.println( apple.calculateTotalPrice());
}}
