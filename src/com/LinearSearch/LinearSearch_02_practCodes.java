package com.LinearSearch;

public class LinearSearch_02_practCodes {
    public static void main(String[] args) {
        // search in string
//        String name = "WaterPark";
//        System.out.println(searchInString(name,'r'));

        //Search in a range
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int target = 4;
//        int start = 0;
//        int end = 7;
//        System.out.println(searchInRange(arr,target,start,end));

        //MIN number search
        // MAX number search in 2D
        // Even Digit -- leetcode;
        // MAX wealth -- leetcode;




    }

    public static int searchInRange(int[]arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static boolean searchInString(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length() ; i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
