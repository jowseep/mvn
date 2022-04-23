package com.Vehicle;

public class Vehicle {
    
    private int numWheels, numEngines;

    public Vehicle(int numWheels, int numEngines) {
        this.numWheels = numWheels;
        this.numEngines = numEngines;
    }

    public void showInfo() {
        System.out.println("The total of wheels are " + numWheels + " and the total engines are " + numEngines +".");
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumEngines() {
        return numEngines;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }
}
