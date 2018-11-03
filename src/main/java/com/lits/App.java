package com.lits;


import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> stringArrayList=new ArrayList<>();
        List<Integer> integerList=new LinkedList<Integer>();
        stringArrayList.add("Pavlo");
        stringArrayList.add("Pavlo1");
        stringArrayList.add("Pavlo2");
        stringArrayList.add("Pavlo3");
        String firstValue=stringArrayList.get(0);
        stringArrayList.set(2,"Pavlo");

        stringArrayList.add(1,"Taras");
        stringArrayList.remove(3);
        System.out.println(stringArrayList);


        integerList.add(3);
        integerList.add (5);
        integerList.add(7);
        integerList.add (9);
        integerLinked




    }
}
