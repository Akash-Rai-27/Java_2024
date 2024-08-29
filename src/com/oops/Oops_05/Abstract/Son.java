package com.oops.Oops_05.Abstract;

public class Son extends Parent{

    public Son(int age) {
        super(age);
//        this.age = age;
    }

    @Override
    void normal() {
        System.out.println("This is overridden of normal in son");
    }

    @Override
    void career() {
        System.out.println("I am going to be valo ");
    }

    @Override
    void partner() {
        System.out.println("Hahhalomo"+ " age: son");
    }
}
