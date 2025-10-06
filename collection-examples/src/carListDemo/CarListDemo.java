package carListDemo;

import java.util.*;

public class CarListDemo {

    private static List<Car> myCarList = new ArrayList<>();
    private static Set<Car> myCarSet = new HashSet<>();
    private static Map<Integer , Car> myCarMap = new HashMap<>();
    private static int counter = 0;
    public static void main(String[] args) {

    Car nexon = new Car();
    nexon.brand = "Tata";
    nexon.model = "XM";
    nexon.yearOfManufacture = 2020;

    Car thar = new Car();
    thar.brand = "Mahindra";
    thar.model = "4x4";
    thar.yearOfManufacture = 2024;

    Car swift  = new Car();
    swift.brand = "Maruti Suzuki";
    swift.model = "ZXI";
    swift.yearOfManufacture = 2025;

        addCarsToList(nexon, thar, swift);
        for(Car car : myCarList){
            System.out.println("Inside list:" + car);
        }

        System.out.printf("\n");

        addCarsToSet(nexon, swift, thar);
        for(Car car : myCarSet){
            System.out.println("Inside set:" + car);
        }

        System.out.printf("\n");

        addCarsToMap (nexon, swift, thar);
        for(Map.Entry<Integer, Car> carEntry : myCarMap.entrySet()){
            System.out.println("Inside map:" + carEntry);
        }
    }

    private static void addCarsToList(Car... cars) {
        for (Car car : cars) {
            myCarList.add(car);
        }
    }
    private static void addCarsToSet(Car... cars) {
        for (Car car : cars) {
            myCarSet.add(car);
        }
    }
    private static void addCarsToMap(Car... cars) {
        for (Car car : cars) {
            myCarMap.put(++counter, car);
        }
    }

}
