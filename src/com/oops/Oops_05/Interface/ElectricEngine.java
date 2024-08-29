package com.oops.Oops_05.Interface;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("ElectricEngine is start via Engine");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine is stop via Engine");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine is accelerate via Engine");
    }
}
