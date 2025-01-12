package com.coderjd.practice.model.practice.service;

import com.coderjd.practice.model.practice.model.Person;

import java.util.Scanner;

public class GovtSchemeDemoApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name : ");
        //new operator provides new object
       String firstName =  scanner.nextLine();

        System.out.println("Please enter last name : ");
        String lastName =  scanner.nextLine();

        System.out.println("Please enter age : ");
        Integer age =  scanner.nextInt();

        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        person.age = age;
        System.out.println("Person details received in system: " + person);


    }
}
