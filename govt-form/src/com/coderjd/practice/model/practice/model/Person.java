package com.coderjd.practice.model.practice.model;

public class Person {

    public String firstName;
     public String lastName;
     public Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
