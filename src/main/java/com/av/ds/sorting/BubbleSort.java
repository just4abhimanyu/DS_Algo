package com.av.ds.sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,12,4,7,1,0};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
