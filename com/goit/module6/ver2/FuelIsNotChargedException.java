package com.goit.module6;

public class FuelIsNotChargedException extends FuelException {
    public FuelIsNotChargedException(String errorCode) {
        super(errorCode);
    }
}
