package com.oops;

import static com.oops.packages.Greeting.message;

public class Oops_02 {
    public static void main(String[] args) {
        Other obj = new Other("Jack");

        message();

    }
}

class Other{
    String a;
    Other(String a){
        this.a = a;
    }

}
