package com.BinarySearch;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 10;
        System.out.println(binarySearch(arr,target));

        // order agnotic binary search
        // we dont know the the array is asc or dec order sorted

    }
    public static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid -1;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }
}
