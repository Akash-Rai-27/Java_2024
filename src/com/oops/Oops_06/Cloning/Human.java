package com.oops.Oops_06.Cloning;

public class Human implements Cloneable {
    int age ;
    String name;
    int[]arr;



//    public Human(Human otherHuman){
//        this.age = otherHuman.age;
//        this.name = otherHuman.name;
//    }



    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {1,2,3,4,5,6};
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        // this is shallow copy

    }
}
