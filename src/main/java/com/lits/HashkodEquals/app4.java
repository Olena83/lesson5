package com.lits.HashkodEquals;

public class app4 {

    public static void main(String[] args) {
//        Class object1= new Class("Petro","Kozak");
//       Class object2=new Class("Petro","Kozak");
//
//        System.out.println(object1.equals(object2) );
//        System.out.println (object1.hashCode() == object2.hashCode());

        Class object3 = new Class();
        object3.firstName = "Iruna";
        object3.lastName = "Grab";
        object3.age = 3;

        System.out.println(object3.name());

//        String a;
//        a=object3.name;
//        System.out.println(a.length());

        int hKode;
        hKode = object3.hashCode();
        System.out.println(hKode);


    }
}
