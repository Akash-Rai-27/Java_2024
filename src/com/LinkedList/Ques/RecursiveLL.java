package com.LinkedList.Ques;

import java.util.LinkedList;

public class RecursiveLL {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        insertRecursively(list, 0, 1);
        insertRecursively(list, 1, 2);
        insertRecursively(list, 2, 3);
        insertRecursively(list, 1, 4); // Insert 4 at index 1

        System.out.println("Linked List after recursive insertions: " + list);
    }

    public static void insertRecursively(LinkedList<Integer> list, int index, int value) {
        if (index == 0) {
            list.addFirst(value);
        } else {
            int first = list.removeFirst(); // Remove the first element
            insertRecursively(list, index - 1, value); // Recursive call
            list.addFirst(first); // Add back the removed element
        }
    }
}
