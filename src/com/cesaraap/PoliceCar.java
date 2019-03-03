package com.cesaraap;

public class PoliceCar extends Vehicle implements Emergency, LandVehicle {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Weeouuu, Weeouuu");
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

    public void criminalIn(){
        System.out.println("We got a criminal");
    }
}
