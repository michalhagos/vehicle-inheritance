package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // create a Moped and set its values using inherited setters
        // this means even though setColor is in Vehicle we can use it on Moped
        // because Moped extends Vehicle / it is the child class
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);
        slowRide.setFuelCapacity(5);

        // create a Car and set its values using inherited setters
        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(50);
        familyCar.setFuelCapacity(15);

        // create a SemiTruck and set its values using inherited setters
        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("White");
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(40000);
        bigRig.setFuelCapacity(300);

        // create a Hovercraft and set its values using inherited setters
        Hovercraft airGlider = new Hovercraft();
        airGlider.setColor("Gray");
        airGlider.setNumberOfPassengers(8);
        airGlider.setCargoCapacity(500);
        airGlider.setFuelCapacity(50);

        // print all vehicle details to verify everything works
        System.out.println("--- Moped ---");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());

        System.out.println("--- Car ---");
        System.out.println("Color: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + familyCar.getCargoCapacity());
        System.out.println("Fuel Capacity: " + familyCar.getFuelCapacity());

        System.out.println("--- Semi Truck ---");
        System.out.println("Color: " + bigRig.getColor());
        System.out.println("Passengers: " + bigRig.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + bigRig.getCargoCapacity());
        System.out.println("Fuel Capacity: " + bigRig.getFuelCapacity());

        System.out.println("--- Hovercraft ---");
        System.out.println("Color: " + airGlider.getColor());
        System.out.println("Passengers: " + airGlider.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + airGlider.getCargoCapacity());
        System.out.println("Fuel Capacity: " + airGlider.getFuelCapacity());
    }










}