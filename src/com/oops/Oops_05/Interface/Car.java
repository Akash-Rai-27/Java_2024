package com.oops.Oops_05.Interface;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("Brake in car");
    }

    @Override
    public void start() {
        System.out.println("Start the engine in the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine in the car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the engine in the car");
    }

//    @Override
//    public void start() {
//        System.out.println("Play the media in the car");
//    }

//    @Override
//    public void stop() {
//        System.out.println("Pause the media in the car");
//    }
}
