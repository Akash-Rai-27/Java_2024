package com.oops.Oops_05.Abstract;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(23);
        son.career();

        Daughter daughter = new Daughter(32);
        daughter.career();



//        Parent mom = new Parent();
//        cant create a object of abstract class

        Parent.hello();
        son.normal();
        daughter.normal();

    }
}
