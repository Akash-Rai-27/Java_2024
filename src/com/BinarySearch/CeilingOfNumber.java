package com.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {

        // when do we apply binary Search
        /*
        * sorted array
        * square root of a number
        * sequence of number
        */

//        ceiling of a number
//         smallest number in arr that is greater of equal to target element

        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int result = arr[ceilingOfNum(arr,target)];
        System.out.println(result);


    }

    public static int ceilingOfNum(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid]< target){
                start = mid+1;
            }
            else if( arr[mid]> target){
                end = mid -1;
            }
        }

        return start;
    }
}
