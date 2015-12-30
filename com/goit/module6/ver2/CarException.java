package com.goit.module6;


public class CarException extends Exception {
    private String errorCode;

    public CarException(String errorCode) {
        this.errorCode = errorCode;
    }
}
