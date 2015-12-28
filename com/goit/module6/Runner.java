package com.goit.module6;


public class Runner {
    public static void main(String[] args) {
        final Car car = new Car(new Engine(100));
        System.out.println("Car has been started "+car.start() );

    }
}
