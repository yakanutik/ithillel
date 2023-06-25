package org.example.homeTasks.six;

import java.util.Objects;

public class CarPrint {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPrint car = (CarPrint) o;
        return year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }
}
