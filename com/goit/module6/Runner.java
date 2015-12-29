package com.goit.module6;


public class Runner {
    public static void main(String[] args) {
        try
           {
            Car car = new Car(new Engine(1));
            car.selfTest(new Driver(true),new Key(true));
            } catch (DriverOrKeyAbsentException e) {
            System.out.println("[Error]: A car can't go without driver or fuel!");
        }
            catch (DriverisNotFastenedException ex) {
            System.out.println("[Error]: Seatbelt is not fastened!");
        }
            catch (DoorsAreNotClosedException exc) {
            System.out.println("[Error]: Doors should be closed");
        }   catch (FuelIsNotChargedException exce) {
            System.out.println("[Error]; No fuel charged!");
        }   catch ( FuelIsNotPetrolException excep) {
            System.out.println("[Error]; Wrong fuel charged!");
        }
        }

    }
