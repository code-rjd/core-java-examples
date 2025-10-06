package carListDemo;

public class Car {
    public String brand;
    public String model;
    public int yearOfManufacture;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
