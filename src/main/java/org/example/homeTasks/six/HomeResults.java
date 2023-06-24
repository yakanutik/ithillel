package org.example.homeTasks.six;

public class HomeResults {
    public static void main(String[] args) {
        // Home task1
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2021);

        Car car2 = new Car();
        car2.setBrand("Toyota");
        car2.setModel("Corolla");
        car2.setYear(2021);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Are car1 and car2 equal (full comparing)? " + car1.equals(car2));

        //Home task2
        CarBrand carBrand1 = new CarBrand();
        carBrand1.setBrand("Toyota");
        carBrand1.setModel("Corolla");
        carBrand1.setYear(2021);

        CarBrand carBrand2 = new CarBrand();
        carBrand2.setBrand("Toyota");
        carBrand2.setModel("CorollaNew");
        carBrand2.setYear(2022);

        System.out.println("Car 1: " + carBrand1);
        System.out.println("Car 2: " + carBrand2);
        System.out.println("Are car1 and car2 equal (comparing just for brands)? " + carBrand1.equals(carBrand2));

        //Home task3
        CarPrint carPrint1 = new CarPrint();
        carPrint1.setBrand("Toyota");
        carPrint1.setModel("Corolla");
        carPrint1.setYear(2021);

        CarPrint carPrint2 = new CarPrint();
        carPrint2.setBrand("Toyota");
        carPrint2.setModel("Corolla");
        carPrint2.setYear(2021);

        System.out.println(carPrint1);
        System.out.println(carPrint2);
    }
}
