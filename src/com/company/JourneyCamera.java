package com.company;

public class JourneyCamera extends CarDecoretor {
    private Car car;

    public JourneyCamera(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 8;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Journey Camera";
    }
}
