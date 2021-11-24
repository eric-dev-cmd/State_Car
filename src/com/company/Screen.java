package com.company;

public class Screen extends CarDecoretor {
    private Car car;

    public Screen(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 7;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Screen";
    }
}
