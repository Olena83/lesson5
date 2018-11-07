package com.lits.HashkodEquals;

public class app4 {

    public static void main(String[] args) {
//        Class object1= new Class("Petro","Kozak");
//       Class object2=new Class("Petro","Kozak");
//
//        System.out.println(object1.equals(object2) );
//        System.out.println (object1.hashCode() == object2.hashCode());

        Class object3 = new Class();
        object3.firstName = "Ira";
        object3.lastName = "Grab";
        System.out.println(object3.razom());

        String a;
        int hCode1;
        a = object3.razom();
        hCode1 = a.hashCode();
        System.out.println(hCode1);

        object3.age = 20;
        System.out.println(object3.age * hCode1);


    }
}
