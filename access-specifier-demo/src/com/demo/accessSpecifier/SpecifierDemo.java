package com.demo.accessSpecifier;

import com.demo.accessSpecifier.defaultSpecifier.model.City;
import com.demo.accessSpecifier.privateSpecifier.model.Vehicle;
import com.demo.accessSpecifier.protectedSpecifier.model.Building;
import com.demo.accessSpecifier.publicSpecifier.model.Student;

public class SpecifierDemo {
    public static void main(String[] args) {
        SpecifierDemo specifierDemo = new SpecifierDemo();
        specifierDemo.publicSpecifierDemo();
        specifierDemo.privateSpecifierDemo();
        specifierDemo.protectedspecifier();
        specifierDemo.defaultSpecifier();
    }
    void publicSpecifierDemo(){
        Student student = new Student();
        student.id = 1;
        student.name = " Aman ";
        student.city = " Mumbai ";
        System.out.println(" Student = " + student);
    }
    void privateSpecifierDemo(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId( 1 );
        vehicle.setMake(" mahindra ");
        vehicle.setModel(" XUV500 ");
        System.out.println(" Vehicle = " + vehicle);
    }
    void protectedspecifier(){
        Building building = new Building();
        building.setId( 1 );
        building.setName(" ABC Building ");
        building.setCity(" XYZ City ");
        System.out.println(" Building = " + building);
    }
    void defaultSpecifier(){
        City city = new City();
        city.setId( 1 );
        city.setState(" MH ");
        city.setName(" Amt ");
        city.setPincode( 444604 );
        System.out.println(" City = " + city);
    }
}