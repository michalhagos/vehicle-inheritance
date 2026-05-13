package com.pluralsight;

public class Hovercraft extends Vehicle {

    // constructor calls the Vehicle parent constructor using super
// this sets all the shared fields without duplicating code
    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }



}