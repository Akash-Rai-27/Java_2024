package com.oops.Oops_05.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine is start via Engine");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine is stop via Engine");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine is accelerate via Engine");
    }
}
