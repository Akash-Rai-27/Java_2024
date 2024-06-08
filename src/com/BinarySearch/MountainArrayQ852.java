package com.BinarySearch;

public class MountainArrayQ852 {
    public static void main(String[] args) {
    // same ques - 162 peak element
        // all the same code
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start +(end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of the array
                // this may be the ans, but look at left
                end = mid;
            }
            else{
                // you are in asc part of array
                start = mid+1;
            }
        }
        // in the end start == end , pointing to the largest number
        return start ;
    }
}
