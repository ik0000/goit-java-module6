package com.goit.module6;


public class Engine {
  private int power;

    public Engine(final int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
    public boolean start(final int power){
        return true;
    }
    public void stop(){}


}
