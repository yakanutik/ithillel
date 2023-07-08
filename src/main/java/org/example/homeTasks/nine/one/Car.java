package org.example.homeTasks.nine.one;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            throw new InvalidBrandException("Brand cannot be empty!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            throw new InvalidModelException("Model cannot be empty!");
        }
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        if (year >= 1900 && year <= 2021) {
            this.year = year;
        } else {
            throw new InvalidYearException("Invalid year!");
        }
    }
}
