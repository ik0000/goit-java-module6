package com.goit.module6;


public class CarException extends Exception {
    private String errorCode;

    public CarException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
