package com.lits.Order;

public class PizzaOrder implements Order {
    private int prise;
    private int weight;

    public int calculateTotalPrice() {
        return prise * weight;
    }


    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
