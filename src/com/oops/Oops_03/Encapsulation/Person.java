package com.oops.Oops_03.Encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void  setName(String name){
        if(name.length()==0){
            this.name = "default";
        }
        else{
        this.name = name;
        }
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    Person(String name, int age){
        setAge(age);
        setName(name);
    }

    void display(){
        System.out.println("Info: ");
        System.out.println("Name : "+ getName());
        System.out.println("Age: "+ getAge());

    }
}
