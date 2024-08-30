package com.oops.Oops_06.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length *2];

        //copy the current items in the new array
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {


        ArrayList list = new ArrayList();
//        list.add(3);
//        list.remove(0);
//        list.get(0);
//        list.set(1,40);
//        list.size();

        CustomArrayList l1 = new CustomArrayList();
//        l1.add(3);
//        l1.add(5);
//        l1.add(8);
        for (int i = 0; i <15 ; i++) {
            l1.add(3*i);
        }
        System.out.println(l1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("jj");
    }
}
