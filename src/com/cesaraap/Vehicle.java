package com.cesaraap;

public class Vehicle {
    private String name;
    private int maxPassengers;
    private double maxSpeed;

    public Vehicle(String name, int maxPassengers, double maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name){
        this.name = name;
        this.maxPassengers = 0;
        this.maxSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
