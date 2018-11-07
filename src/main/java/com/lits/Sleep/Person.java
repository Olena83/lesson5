package com.lits.Sleep;

public class Person {

    public void sleep() {
        System.out.println("персона повинна проспати 15 хвилин");
    }

    public void sleep(int quantity) {
        System.out.println("персона повинна проспати " + quantity + " хвилин");
    }

    public void sleep(int quantity, String timeUnit) {
        System.out.println("персона повинна проспати " + quantity + " " + timeUnit);
    }
}