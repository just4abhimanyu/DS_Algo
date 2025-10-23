package com.av.ds.arrays;
/*
You have an arrays of zeros (0) and (1) keep all zeros at the left hand side and all 1 to right hand side ?
i.e.: Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]
 */
public class SortFixedTwoTypeOfNumber {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,1,0,0,1};
        sortTwoTypeOfNumber(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }

    private static void sortTwoTypeOfNumber(int[] arr) {

        int zeroIndex = 0;
        int oneIndex = arr.length -1;
        while (zeroIndex < oneIndex){

            if(arr[zeroIndex] == 0){
                zeroIndex++;
            }else if(arr[oneIndex] == 1){
                oneIndex--;
            }else {
                // swap
               swap(arr, zeroIndex, oneIndex);
                zeroIndex++;
                oneIndex--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
