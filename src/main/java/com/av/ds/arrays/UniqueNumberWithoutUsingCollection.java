package com.av.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Find all unique numbers in an array without using any collection framework.

 */
public class UniqueNumberWithoutUsingCollection {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] result = findUniqueNumbers(arr);

        System.out.println("Unique numbers in the array are:"+ Arrays.toString(result));
    }

    private static int[] findUniqueNumbers(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int num : arr) { // Find the maximum number in the array
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1]; // Create a count array to store the frequency of each number
        for (int num : arr) {
            count[num] = count[num] + 1; // Increment the count for each number
        }

        List<Integer> uniqueNumbers = new ArrayList<>(); // List to store unique numbers
        for (int j = 0; j < count.length; j++) { // Find numbers that appear only once
            if (count[j] == 1) { // If the count is 1, it's a unique number
                uniqueNumbers.add(j); // Add to the list of unique numbers
            }
        }
        return uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
