package com.oops.staticExample;

public class StaticInt {
    static int a = 4;
    static int b ;

    static {
        System.out.println("This is static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+ " "+StaticInt.b);

    }
}
