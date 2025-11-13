package service;

import model.Person;
import model.PersonHandler;

public class AccessModifiersDemo {

    public static void main(String[] args) {

        PersonHandler handler = new PersonHandler();
        Person person = handler.createPerson();
        System.out.println("Personal details:" + person);
    }
}