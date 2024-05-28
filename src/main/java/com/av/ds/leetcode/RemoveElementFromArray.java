package com.av.ds.leetcode;

import java.util.Arrays;

public class RemoveElementFromArray {

    private static void removeElement(int[] arr , int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != target){
                arr[count] = arr[i];
                arr[i] = 0;
                count++;
            }else{
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,3,5,3,4};
        removeElement(arr,3);
        System.out.println(Arrays.toString(arr)); //o/p = [5, 4, 0, 0, 0]
    }
}
