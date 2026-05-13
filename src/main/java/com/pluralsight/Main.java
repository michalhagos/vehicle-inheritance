package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // create a Moped using the constructor instead of setters
        // the values are passed directly to Vehicle through super()
        Moped slowRide = new Moped("Red", 2, 10, 5);

        // create a Car using the constructor instead of setters
        Car familyCar = new Car("Blue", 5, 50, 15);

        // create a SemiTruck using the constructor instead of setters
        SemiTruck bigRig = new SemiTruck("White", 2, 40000, 300);

        // create a Hovercraft using the constructor instead of setters
        Hovercraft airGlider = new Hovercraft("Gray", 8, 500, 50);

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