package com.LinearSearch;

public class LinearSearch_01 {
    public static void main(String[] args) {
        // linear search
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int result = linearSearch(arr, target);
        if(result ==-1){
            System.out.println("NOT found");
        }
        else {
            System.out.println("at the index: "+ result);
        }

    }
    public static int linearSearch(int[]arr, int target){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
