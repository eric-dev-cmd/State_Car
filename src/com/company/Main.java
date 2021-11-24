package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car = new ReverseCamera(new Screen(new CarMT()));

        System.out.println(car.getDescription());
        System.out.println(car.cost());
    }
}
