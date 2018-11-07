package com.lits.Order;

public class AppleOrder implements Order {
    private int prise;
    private int quantity;

    public int calculateTotalPrice() {
        return getPrise() * getQuantity();
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
