package com.company;

public class ReverseCamera extends CarDecoretor {
    private Car car;

    public ReverseCamera(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 5;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", ReverseCamera";
    }
}
