package com.oops.Oops_05.Interface.NestedInteface;

public class A {
    // nestes inteface

    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

