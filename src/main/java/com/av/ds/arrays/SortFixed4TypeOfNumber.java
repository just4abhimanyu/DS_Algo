package com.av.ds.arrays;

import static java.util.Collections.swap;

public class SortFixed4TypeOfNumber {



    public static void main(String[] args) {
        int[] arr = {3,2,1,0,3,2,1,0,1,2,3,0};
        sortFixed4TypeOfNumber(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }

    private static void sortFixed4TypeOfNumber(int[] arr) {

        int zeroIndex = 0;
        int oneIndex = 0;
        int twoIndex = arr.length -1;
        int threeIndex = arr.length -1;

        while (oneIndex <= twoIndex){

            if(arr[oneIndex] == 0){
                swap(arr, zeroIndex, oneIndex);
                zeroIndex++;
                oneIndex++;
            }else if(arr[oneIndex] == 1){
                oneIndex++;
            }else if(arr[oneIndex] == 2){
                swap(arr, oneIndex, twoIndex);
                twoIndex--;
            }else {
                swap(arr, oneIndex, twoIndex);
                swap(arr, twoIndex, threeIndex);
                twoIndex--;
                threeIndex--;
            }
        }
    }
    private static void swap(int[] arr, int currentIndex, int zeroIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] =  arr[zeroIndex];
        arr[zeroIndex] = temp;
    }
}
