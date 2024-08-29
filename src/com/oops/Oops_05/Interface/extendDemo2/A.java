package com.oops.Oops_05.Interface.extendDemo2;

public interface A {

    //static interface methods should always have a body
    // call via the interface name
    static void greeting(){
        System.out.println("I am static method in the interface A");
    }

   default void fun(){
       System.out.println("I am in A");
   }
}
