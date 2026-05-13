package com.pluralsight;

public class Vehicle {
    // declaring the variables for the parent class
    // the color of the vehicle
    private String color;
    // how many passengers the vehicle can carry
    private int numberOfPassengers;
    // how much cargo the vehicle can carry in pounds
    private int cargoCapacity;
    // how much fuel the vehicle can hold in gallons
    private int fuelCapacity;

    // added all getters
    // returns the color of the vehicle
    public String getColor() {
        return color;
    }

    // returns how many passengers the vehicle can carry
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // returns how much cargo the vehicle can carry
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // returns how much fuel the vehicle can hold
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    // added setters
    // updates the color of the vehicle
    public void setColor(String color) {
        this.color = color;
    }

    // updates how many passengers the vehicle can carry
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // updates how much cargo the vehicle can carry
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // updates how much fuel the vehicle can hold
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }














}