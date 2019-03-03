package com.cesaraap;

public class Jeep extends Vehicle implements LandVehicle {
    private int numWheels;

    public Jeep(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public Jeep(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method");
    }

    public void soundHorn(){
        System.out.println("Meep, meep");
    }
}
