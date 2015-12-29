package com.goit.module6;

public class Fuel {
    private double fuelVolume;
    private boolean fuelCharged = true;
    private String fuelType;
    private boolean isPeterol;

    public boolean fuellIsPeterol() {
        return isPeterol;
    }

    public Fuel(double fuelVolume, boolean fuelCharged) {
        this.fuelVolume = fuelVolume;
        this.fuelCharged = fuelCharged;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public boolean isFuelCharged() {
        return fuelCharged;
    }

    public void setFuelCharged(boolean fuelCharged) {
        this.fuelCharged = fuelCharged;
    }
    public double charge(double fuelVolume){
        System.out.println("Car fueled for "+ fuelVolume);
        return fuelVolume;
    }
}
