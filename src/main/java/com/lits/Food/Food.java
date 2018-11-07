package com.lits.Food;

public class Food {
    private double price;
    private int quantity;
    private double weight;

    //конструктор1
    Food() {
    }

    //конструктор 2
    Food(double newPrice, int newQuantity, double newWeight) {
        this.price = newPrice;
        this.quantity = newQuantity;
        this.weight = newWeight;
    }

    //конструктор 3
    Food(double newPrice, int newQuantity) {
        this.price = newPrice;
        this.quantity = newQuantity;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
