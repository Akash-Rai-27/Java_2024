package com.oops.Oops_05.Interface;

public class Main {
    public static void main(String[] args) {
        Engine c1 = new Car();
//        c1.start();
//        c1.acc();
////        c1.brake();
//        c1.stop();

        Media m1 = new Car();
//        m1.stop();
//        m1.start();



        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();


    }
}
