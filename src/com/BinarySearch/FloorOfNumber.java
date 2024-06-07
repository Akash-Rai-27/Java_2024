package com.BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        // floor of a number
        // greatest num that is smallest or equal to target

        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int result = arr[floorOfNum(arr,target)];
        System.out.println(result);

    }

    public static int floorOfNum(int[]arr, int target){
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

        return end;
    }
}
