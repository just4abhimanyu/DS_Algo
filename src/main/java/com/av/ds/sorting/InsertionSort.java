package com.av.ds.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2,0,12,4,7,1,0};
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        // If the array is null or has less than 2 elements, no need to sort
        if (arr == null || arr.length < 2) {
            return;
        }

        // Loop starts from index 1 (we assume the element at index 0 is "sorted")
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // Current element to insert into the sorted part
            int j = i - 1;      // Index of the previous element in the sorted part

            // Shift elements of the sorted part that are greater than 'key'
            // one position ahead to make space for 'key'
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert 'key' at the correct position
            arr[j + 1] = key;
        }
    }

}
