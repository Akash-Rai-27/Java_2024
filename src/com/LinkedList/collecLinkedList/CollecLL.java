package com.LinkedList.collecLinkedList;

import java.util.LinkedList;

public class CollecLL {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(14);
        list.add(34);
        System.out.println(list);

        // insertion at specific index
//        list.add(3,30);
//        System.out.println(list);
//        list.addAll();
        list.addFirst(44);
        list.addLast(100);
        System.out.println(list);
//        list.clear(); // remove all elements
//        System.out.println("All elements removed");
//        System.out.println(list);
        // list.contains() --> returns a boolean
        System.out.println(list.contains(100));
        System.out.println(list.element());
//        list.get(4);
        list.getFirst();
        list.getLast();
//        System.out.println(list.get(4));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
