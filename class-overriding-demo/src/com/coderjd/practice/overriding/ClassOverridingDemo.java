package com.coderjd.practice.overriding;

import com.coderjd.practice.overriding.service.CarService;
import com.coderjd.practice.overriding.service.VehicleService;

public class ClassOverridingDemo {
    public static void main(String[] args) {

            VehicleService vehicleService = new VehicleService();
            vehicleService.move();

            vehicleService = new CarService();
            vehicleService.move();
        }
    }
