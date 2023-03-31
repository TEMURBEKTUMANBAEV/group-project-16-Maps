package com.devxschool;
import java.util.Map;
import java.util.HashMap;



public class FirstAndLastVehicle {

    public static void main(String[] args) {
        /**
         * Create a map of cars, so they have orders
         * and print out first and last entry in the map
         * ex:
         * 5, "BMW"
         * 3, "Tesla"
         * 1, "Mercedes"
         * 4, "Audi"
         * 10, "Ford"
         /*
         * print out:
         * 1, "Mercedes"
         * 10, "Ford"
         */
        print();
    }

    public static void print() {
        //TODO implement this method
        Map<Integer, String> mapOfCars = new HashMap<>();
        mapOfCars.put(5, "BMW");
        mapOfCars.put(3, "Tesla");
        mapOfCars.put(1, "Mercedes");
        mapOfCars.put(4, "Audi");
        mapOfCars.put(10, "Ford");
        for (Map.Entry<Integer, String> cars : mapOfCars.entrySet()) {
            if (cars.getKey() <= 1 || cars.getKey() >= 10) {
                System.out.println(cars.getKey() + "=" + cars.getValue());
            }
        }
    }
}