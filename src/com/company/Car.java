package com.company;

public abstract class Car {
    protected String description = "Unknown Toyota Vios";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
