package com.goit.module6;


public class NoDriverException extends DriverException
{
    public NoDriverException(String errorCode) {
        super(errorCode);
    }
}
