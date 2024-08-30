package com.oops.Oops_06.LamdaFunction;

import java.util.ArrayList;

public class LamdaFunction {
    public static void main(String[] args) {
//        int[] arr = {3,4,5,1,32};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i*3);
        }
//        System.out.println(arr);

        arr.forEach((item)->{
//            System.out.print(item*3+" ");
        });

        Operation sum = (a,b) -> a+b;
        Operation product = (a,b) -> a*b;
        Operation subtraction = (a,b) -> a-b;

        LamdaFunction l1= new LamdaFunction();
//        l1.operate(5,3,sum);
        System.out.println(l1.operate(5,3,sum));
        System.out.println(l1.operate(5,3,subtraction));
        System.out.println(l1.operate(5,3,product));


    }
//
//    int sum(int a, int b){
//        return a + b;
//    }

    private  int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }


}
interface  Operation {
    int operation(int a, int b);
}