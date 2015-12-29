package com.goit.module6;

public class Car {
    private Engine engine;
    private Fuel fuel;
    private Driver driver;
    private Door door;
    private Key key;

    public Car(final Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;

    }

    public boolean selfTest(Driver driver, Key key) throws DriverOrKeyAbsentException,DriverisNotFastenedException, DoorsAreNotClosedException, FuelIsNotChargedException, FuelIsNotPetrolException {
        if ((driver.driverIsPresent == false) | (key.keyPresent() == false)) {
            throw new DriverOrKeyAbsentException();
        }
        System.out.println("Prerequisites ot start the car are met, let's do it!");
        Fuel f = new Fuel(10, true);
        Driver d = new Driver(true);
        Door doorLeftFront = new Door("Left Front", true);
        Door doorLeftBack = new Door("Left back", false);
        Door doorRightFront = new Door("Right Front", true);
        Door doorRightBack = new Door("Right Back", false);
        if (d.buckleUP() == false) {
            throw new DriverisNotFastenedException();
        } else if ((doorLeftFront.isDoorClosed() == false) || (doorLeftBack.isDoorClosed() == false) || (doorRightFront.isDoorClosed() == false) || (doorRightBack.isDoorClosed() == false)) {
            throw new DoorsAreNotClosedException();
        } else if (f.isFuelCharged() == false) {
            throw new FuelIsNotChargedException();
        } else if (f.fuellIsPeterol() == false) {
            throw new FuelIsNotPetrolException();

        }
        return true;
    }
    }
