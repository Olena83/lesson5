package com.lits.HashkodEquals;

import java.util.Objects;

public class Class {
    String firstName;
    String lastName;
    int age;

    public String name() {
        return firstName + " " + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name().length() * age);
    }

//конструктор для equals
//    Class(String NewfirstName, String NewlastName)
//  {
//      this.setFirstName(NewfirstName);
//      this.setLastName(NewlastName);}

    //hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(firstName, aClass.firstName) &&
                Objects.equals(lastName, aClass.lastName);
    }
}