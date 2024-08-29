package com.oops.Oops_03.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("maike");
//        System.out.println(person.getName());
//        person.setAge(11);
//        System.out.println(person.getAge());

        Person obj = new Person("miker", 23);
//        obj.display();
        Person obj2 = new Person("", -1);
        obj2.display();
    }
}
