package com.BinarySearch;

public class FindInMountainArrayQ1095 {
    public static void main(String[] args) {
        // sloved in leetcode
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peak = peakIndexArray(arr);
        int firstTry = binarySearch(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnobinarySearch(arr,target,peak,arr.length-1);

    }


    public static int   peakIndexArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }


    public static int binarySearch(int[]arr, int target , int start , int end){

        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]> target){
                end = mid-1;
            }
            else if (arr[mid]< target){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    public static int orderAgnobinarySearch(int[]arr, int target , int start , int end){

        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid] < target){
                end = mid-1;
            }
            else if (arr[mid]> target){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }



}
