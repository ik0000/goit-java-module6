package com.goit.module6;


public class Driver {
    private boolean driverIsPresent;
    private String driverName;

    public String getDriverName() {
        return driverName;
    }

    public Driver(String driverName) {
        this.driverName = driverName;
    }
    public boolean buckleUP(){
        return true;
    }
    public boolean detach(){
        return true;
    }
}

