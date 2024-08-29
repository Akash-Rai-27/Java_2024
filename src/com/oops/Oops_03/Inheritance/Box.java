package com.oops.Oops_03.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
      this.l = -1;
      this.h = -1;
      this.w = -1;
    }

    Box (double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box( Box oldBox){
        this.l = oldBox.l;
        this.w = oldBox.h;
        this.h = oldBox.h;
    }

    public void displayInfo(){
        System.out.println("Computing the box");
    }

}
