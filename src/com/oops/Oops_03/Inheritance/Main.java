package com.oops.Oops_03.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println("Nothing box");
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);
//
//        Box box2 = new Box(4);
//        System.out.println("Square box");
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);
//
//        Box box3 = new Box(10,5,9);
//        System.out.println("Rectangle box");
//        System.out.println(box3.l+" "+box3.w+" "+box3.h);
//
//        Box box4 = new Box(box3);
//        System.out.println("Old box");
//        System.out.println(box4.l+" "+box4.w+" "+box4.h);

        BoxWeight boxW1 = new BoxWeight();
//        System.out.println(boxW1.h+" "+boxW1.w+" "+boxW1.l+" "+boxW1.weight);

        BoxWeight boxW4 = new BoxWeight(10,20,12,40);
//        System.out.println(boxW4.h+" "+boxW4.w+" "+boxW4.l+" "+boxW4.weight);

        Box obj1 = new BoxWeight(2,4,4,9);
        System.out.println(obj1.l);
        System.out.println(obj1.h);
        System.out.println(obj1.w);
//        System.out.println(obj1.weight);

//        BoxWeight obj2 = new Box(3,5,7,30);
//        System.out.println(obj2.l);


    }
}
