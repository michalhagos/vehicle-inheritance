package com.pluralsight;

// Car extends Vehicle which means it inherits all fields and methods from the Vehicle class automatically
public class Car extends Vehicle {


    // this constructor calls the Vehicle parent constructor using super
// this sets all the shared fields without duplicating code
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }


}