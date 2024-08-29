package com.oops.Oops_05.Abstract;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
//        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be shark ");
    }

    @Override
    void partner() {
        System.out.println("knighhht"+ " age:  daughter");
    }
}
