package org.example.homeTasks.seven.three;

public class Car {
    private String engine;
    private String color;
    private int year;


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        if (engine != null && !engine.isEmpty()) {
            this.engine = engine;
        } else System.out.println("Engine type is not valid");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else System.out.println("Engine type is not valid");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2021) {
            this.year = year;
        } else System.out.println("Engine type is not valid");
    }
}

