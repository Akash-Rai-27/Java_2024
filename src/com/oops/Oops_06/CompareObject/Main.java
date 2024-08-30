package com.oops.Oops_06.CompareObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students kai = new Students(11, 56.3f);
        Students eki = new Students(14, 45.6f);

        if(kai.compareTo(eki) < 0){
            System.out.println(kai.compareTo(eki));
            System.out.println("just print");
        }
        System.out. println(kai.compareTo(eki));
        System.out. println(eki.compareTo(kai));
//        Arrays.sort();
    }
}
