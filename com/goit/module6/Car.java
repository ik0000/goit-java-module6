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
    public boolean start() {
        Fuel f = new Fuel(10, true);
        Driver d = new Driver();
        Key k = new Key();
        Door dlf = new Door("Left Front", true);
        Door dlb = new Door("Left back", false);
        Door drf = new Door("Right Front",true);
        Door drb = new Door("Right Back", false);

        try
        { engine.start(1);
            if (f.isFuelCharged() == false) {
                throw new CarException("No fuel","01");
            }
            else if (d.buckleUP() == true) {
                throw new CarException("Driver's seatbelt not fastened", "02");
            }
            else if (d.driverIsPresent == false){
            throw new CarException("Driver is absent", "03");
             }
            else if (k.keyPresent() == false) {
                throw new CarException("Key is absent", "04");
            }
            else if (dlf.getDoorState() == false){
                throw new CarException("Left fromt door is opened", "05");
            }
            else if (dlb.getDoorState() == false){
                throw new CarException("Left back door is opened", "06");
            }
            else if (drf.getDoorState() == false){
                throw new CarException("Right fromt door is opened", "07");
            }
            else if (drb.getDoorState() == false){
                throw new CarException("Right back door is opened", "05");
            }
        } catch (CarException e) {
            e.printStackTrace();
        }
        return this.engine.start(1);

        }
    }