package carListDemo;

import java.util.*;

public class CarListDemo {

    private static final List<Car> myCarList = new ArrayList<>();
    private static final Set<Car> myCarSet = new HashSet<>();

    private static final Map<Integer , Car> myCarMap = new HashMap<>();
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

        addCarsToList(nexon, thar, swift, nexon, thar, swift);
        for(Car car : myCarList){
            System.out.println("Inside list:" + car);
        }

        System.out.println("\n");

        addCarsToSet(nexon, swift, thar, nexon, thar, swift);
        for(Car car : myCarSet){
            System.out.println("Inside set:" + car);
        }

        System.out.println("\n");

        addCarsToMap (nexon, swift, thar, nexon, thar, swift);
        for(Map.Entry<Integer, Car> carEntry : myCarMap.entrySet()){
            System.out.println("I have this car : with car ID as: " + carEntry.getKey() + "\tand car details as :" + carEntry.getValue());
        }
    }

    private static void addCarsToList(Car... cars) {
        Collections.addAll(myCarList, cars);

    }
    private static void addCarsToSet(Car... cars) {
        Collections.addAll(myCarSet, cars);
    }
    private static void addCarsToMap(Car... cars) {
        for (Car car : cars) {
            myCarMap.put(++counter, car);
        }
    }

}
