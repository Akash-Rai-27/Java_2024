package com.oops.Oops_06.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jay = new Human(32,"jay");
//    Human tw = new Human(jay);
        Human twin = (Human) jay.clone();
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        twin.name = "jackii";
        System.out.println(Arrays.toString(jay.arr));
        System.out.println(jay.name);
        System.out.println(twin.name);
    }
}
