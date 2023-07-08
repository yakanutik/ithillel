package org.example.homeTasks.seven.three;

public class Three {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setEngine("gasoline");
        myCar.setColor("red");
        myCar.setYear(2021);

        System.out.println("My car has a " + myCar.getEngine() + " engine, is " + myCar.getColor() + ", and was made in " + myCar.getYear());
    }
}
