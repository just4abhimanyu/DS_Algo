package com.av.ds.sorting;

import java.util.Arrays;

public class MergeSort {

    private static void conquer(int[] arr, int[] temp, int left, int mid, int right){

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
    private static void divide(int[] arr, int[] temp, int left, int right){
       // System.out.println(Arrays.toString(arr));
        if (left < right) {
            int mid = (left + right) / 2;
            divide(arr, temp, left, mid);
            divide(arr, temp, mid + 1, right);
            conquer(arr, temp, left, mid, right);
        }
    }
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        divide(arr, temp, 0, arr.length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3,6,1,9,5,2,1};
        System.out.println("Original:"+ Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Result  :"+ Arrays.toString(arr));
    }
}
