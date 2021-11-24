package com.company;

public class Carpet extends CarDecoretor {
    private Car car;

    public Carpet(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 1;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Carpet";
    }
}
