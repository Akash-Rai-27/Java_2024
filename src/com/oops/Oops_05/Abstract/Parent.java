package com.oops.Oops_05.Abstract;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("THis is static method in abstract class");
    }

    // normal methods
    void normal(){
        System.out.println("this is a normal method in abstract class");
    }

//    abstract  Parent(){} cant create abstract constructor
    abstract  void career();
    abstract  void partner();
}
