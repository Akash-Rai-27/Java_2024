package com.Arrays;
import java.util.*;

public class Arrays_02_MoreCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        swapNumber(arr, 0,9);
        System.out.println(Arrays.toString(arr));
//        System.out.println(maxNumber(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // SWAP
    public static void swapNumber(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // MAX
    public static int maxNumber(int[]arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Reverse
    public static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swapNumber(arr,start,end);
            start++;
            end--;
        }
    }


}
