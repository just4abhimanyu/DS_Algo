package com.av.ds.sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] arr) {

        // Outer loop goes through each position in the array
        // At the end of each iteration, the smallest element from the unsorted part
        // is placed at index 'i'
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; // Assume the current position has the minimum

            // Inner loop finds the index of the minimum element
            // in the unsorted portion of the array (from i+1 to end)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the element at index 'i'
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,55,0,44,3,21,12};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
