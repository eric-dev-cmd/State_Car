package com.company;

public class CarMT extends Car {
    public CarMT() {
        description = "Toyota Vios MT";
    }

    @Override
    public double cost() {
        return 585;
    }
}
