package com.cesaraap;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private double displacement;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    public Hovercraft(String name, int numWheels, double displacement) {
        super(name);
        this.numWheels = numWheels;
        this.displacement = displacement;
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

    @Override
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling Laumh() method");
    }

    public void enterLand(){
        System.out.println("Hovercraft entering land");
    }

    public void enterSea(){
        System.out.println("Hovercraft entering sea");
    }
}
