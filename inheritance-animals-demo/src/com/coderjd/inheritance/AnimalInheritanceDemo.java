package com.coderjd.inheritance;

import com.coderjd.inheritance.service.DogService;

public class AnimalInheritanceDemo {
    public static void main(String[] args) {
        DogService dog = new DogService();
        dog.makeSound(); //can access properties of parent class
        dog.bark(); //also can access own properties
    }
}
