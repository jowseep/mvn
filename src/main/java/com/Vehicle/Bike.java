package com.Vehicle;

// this creates a new class bike which inherits from Vehicle
public class Bike extends Vehicle {
    //this initiates wheelie power
    private int wheeliePower;

    public Bike(int numWheels, int numEngines, int wheeliePower) {
        super(numWheels, numEngines);
        this.wheeliePower = wheeliePower;
    }
    //this shows info for the bike class
    public void showInfo() {
        System.out.println("\nThis bicyle has " + getNumWheels() + " wheels and " + getNumEngines() + " engines.");
        System.out.println("It also has a wheelie power of " + wheeliePower + " .\n");
    }
}
