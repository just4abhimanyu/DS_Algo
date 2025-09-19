package com.av.ds.leetcode;

import java.util.Arrays;

public class RemoveElementFromArray {

    private static void removeElement(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != target) {
                arr[count++] = arr[i];
            }
        }

        for (int j = 0; j < count; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 5, 3, 4};
        System.out.println(Arrays.toString(arr));
        removeElement(arr, 3);
    }
}
