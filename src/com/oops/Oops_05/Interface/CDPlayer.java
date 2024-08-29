package com.oops.Oops_05.Interface;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Start the CD player by media");
    }

    @Override
    public void stop() {
        System.out.println("Stop the CD player by media");
    }
}
