package com.goit.module6;


public class Runner {
    public static void main(String[] args) throws DriverException {
        Car car = new Car();

        try {

            car.setDriver(new Driver("Bob"));
            car.fastenDriver();
            car.setPetrol("Petrol");
            car.start();

        }   catch (DriverNotFastenedException ex) {
            System.out.println("[Error]: Seatbelt is not fastened!");
        }   catch (DoorsAreNotClosedException exc) {
            System.out.println("[Error]: Doors should be closed");
        }   catch (FuelIsNotChargedException exce) {
            System.out.println("[Error]; No fuel charged!");
        }   catch ( FuelIsNotPetrolException excep) {
            System.out.println("[Error]; Fuel is not Petrol!");
        }   catch ( NoDriverException except) {
            System.out.println("[Error]; No driver present in the car!");
        }   catch (CarException e) {
            e.printStackTrace();
        }
    }
}