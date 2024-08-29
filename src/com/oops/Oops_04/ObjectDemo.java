package com.oops.Oops_04;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        System.out.println("Running the hashcode: "+ num);
        return super.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(10);
        ObjectDemo obj2 = new ObjectDemo(30);

//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());

//        if(obj1.num > obj2.num){
//            System.out.println("Obj1 is greater");
//        }
//        else {
//            System.out.println("Obj2 is greater");
//        }

        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass());




    }


}
