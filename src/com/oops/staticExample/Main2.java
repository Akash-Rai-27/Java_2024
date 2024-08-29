package com.oops.staticExample;

public class Main2 {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variable are pointing to just one object
    }
}
