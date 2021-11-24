package com.company;

public class CarAT extends Car {
    public CarAT() {
        description = "Toyota Vios AT";
    }

    @Override
    public double cost() {
        return 625;
    }
}
