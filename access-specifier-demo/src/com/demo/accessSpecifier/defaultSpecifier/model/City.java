package com.demo.accessSpecifier.defaultSpecifier.model;

public class City {
    int id;
    String state;
    String name;
    int pincode;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
