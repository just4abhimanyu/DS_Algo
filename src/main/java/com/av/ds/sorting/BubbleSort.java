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
       // bubbleSort(arr);
        bubbleSort_betterWay(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort_betterWay(int[] arr){

        for (int i =0; i< arr.length; i++){

            for (int j = 0; j< arr.length - i-1; j++){ // arr.length - i-1 ==> ignoring already sorted array

                if (arr[j] < arr[j + 1]){

                    int tmp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = tmp;
                }


            }

        }
    }

}
