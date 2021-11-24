package com.company;

public class CarCVT extends Car {
    public CarCVT() {
        description = "Toyota Vios CVT";
    }

    @Override
    public double cost() {
        return 600;
    }
}
