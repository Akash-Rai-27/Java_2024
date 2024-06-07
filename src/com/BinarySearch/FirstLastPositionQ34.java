package com.BinarySearch;

public class FirstLastPositionQ34 {
    public static void main(String[] args) {

    }

//    nums = [5,7,7,8,8,10]

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        // check for first occ if target element
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else {
                // potential ans found
                return mid;
            }
        }

        return -1;
    }

    static int[] binarySearch(int[]nums, int target, boolean findStartIndex){
        int[] ans = {-1,-1};

        // check for first occ if target element
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else {
                // potential ans found
                ans = mid;
            }
        }
        return ans;
    };
