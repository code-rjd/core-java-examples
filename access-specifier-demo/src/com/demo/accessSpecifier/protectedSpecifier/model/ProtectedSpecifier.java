package com.demo.accessSpecifier.protectedSpecifier.model;

public class ProtectedSpecifier {
    public static void main(String[] args) {

        //example that this below cannot be accessed in Specifier Demo
        // bcz this all comes under the protected specifier

        Building building = new Building();
        building.id = 1 ;
        building.name = " eden garden";
        building.city = "Kolkata";
        System.out.println(" Building = " + building);

    }
}
