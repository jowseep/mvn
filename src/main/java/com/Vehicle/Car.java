package com.Vehicle;

public class Car extends Vehicle {

    private int storageCapacity;

    public Car(int numWheels, int numEngines, int storageCapacity) {
        super(numWheels, numEngines);
        this.storageCapacity = storageCapacity;
    }

    public void showInfo() {
        System.out.println("\n");
        System.out.println("This car has " + getNumWheels() + " wheels and " + getNumEngines() + " engine/s.");
        System.out.println("It also has a storage capacity of " + storageCapacity + " .");
    }
    
}
