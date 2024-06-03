package com.Arrays;

import java.util.*;

public class Arrays_01_Intro {
    public static void main(String[] args) {


//         String[] arr = new String[5];
//         System.out.println(arr[0]);
//
//         // 2d arrays
//        int[][] twod = new int[3][];
//
//        int[][] temp = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        // taking Input from user
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println("Enter the values of arrays");
//        for(int i= 0; i<5;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        System.out.println("Enter the values of the 2d array");
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for(int i=0; i<arr.length;i++){
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//
//        for(int i=0; i<arr.length;i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        // ArrayList

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // methods of ArrayList
        arrList.add(1);
        // append the element at the end of a list
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        System.out.println(arrList);

        arrList.add(0,100);
        // insert the specified element at the specified position in a list
        // arrList.add(int index, element);
        System.out.println(arrList);
//        arrList.clear();  // remove all the elements in the list

//        arrList.get() //  get an element of an index
//        System.out.println(arrList.get(2));

        System.out.println(arrList.isEmpty()); // checks if list is empty or not return boolean
        System.out.println(arrList.lastIndexOf(1)); // return the index of last occurrence of an element
        System.out.println(arrList.contains(100)); // true if it contains
        arrList.remove(0); // remove an element of the given index
//        System.out.println(arrList.remove(100));
        // arrList.set(int index, element);
    }
}
