package com.av.ds.sorting;

import java.util.Arrays;

public class QuickSort {
    private static void getSortedByQuickSort(int[] arr){
        if (arr == null || arr.length == 1){
            return;
        }
        divide(arr, 0, arr.length-1 );
    }
    private static void divide(int[] arr, int low, int high){
        if (low < high){
            int pivot = getPartation(arr,low,high);

            divide(arr,low,pivot-1);
            divide(arr, pivot+1, high);
        }
    }
    private static int getPartation(int[] arr, int low, int high){
        int pivote = arr[high];
        int i = low -1;
        for (int j = low; j < high; j++) {

            if (arr[j] < pivote){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr= {3,1,8,4,7,5};
        System.out.println(Arrays.toString(arr));
        getSortedByQuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
