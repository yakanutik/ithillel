package org.example.homeTasks.nine.two;

import org.example.homeTasks.nine.one.Car;
import org.example.homeTasks.nine.one.InvalidBrandException;
import org.example.homeTasks.nine.one.InvalidModelException;
import org.example.homeTasks.nine.one.InvalidYearException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.setBrand(null);
        } catch (InvalidBrandException ignored) {

        }

        try {
            car.setModel("");
        } catch (InvalidModelException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            car.setYear(2023);
        } catch (InvalidYearException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
