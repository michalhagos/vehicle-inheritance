package com.pluralsight;

// Moped extends Vehicle which means it inherits all fields and methods from the Vehicle class automatically
public class Moped extends Vehicle {

    // constructor calls the Vehicle parent constructor using super
// this sets all the shared fields without duplicating the previous code
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }


}