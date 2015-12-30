package com.goit.module6;

   class Car {

        private Driver driver;
        private boolean isDriverFastened;
        private String fuel = "diesel";
        private String petrol = "Petrol";
        private boolean hasFuel = true;
        private boolean fuelIsPetrol;

       Car() {
       }

       public void start()throws CarException{
            if(hasDriver()) {
                if(isDriverFastened()) {
                    System.out.println("Driver "+driver.getDriverName()+ " is ok!");
                } else {
                    throw new DriverNotFastenedException("Driver must be fastened");
                }
            } else {
                throw new NoDriverException("Driver must be set");
            }
            if (hasFuel()) {
                if (fuelIsPetrol(this.fuel)){
                    System.out.println("Fuel is charged and correct kind!");
            } else {
               throw new FuelIsNotPetrolException("Fuel should be petrol");
                }
                } else throw new FuelIsNotChargedException("Fuel is not charged");
            System.out.println("Car successfully started!");
        }

        private boolean hasDriver() {
            return driver != null;
        }

        private boolean isDriverFastened() {
            return isDriverFastened;
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

       public void setPetrol(String fuel) {
           this.fuel = fuel;
           System.out.println("Charged some "+ fuel + " ready to go!");
       }
       private boolean hasFuel() {
           /*int a;
           if (fuelVolume > 0) a =1; else a=0;
           */return hasFuel;
       }

        public void fastenDriver() {
           this.isDriverFastened = true;
       }

       public boolean fuelIsPetrol(String fuel){
           if ((fuel.equals( petrol ) == true)) { fuelIsPetrol = true;
                 System.out.println("Fuel is petrol!");
           }
           else {
               System.out.println("Fuel is not Petrol");
           }
           return fuelIsPetrol;
       }
    }

