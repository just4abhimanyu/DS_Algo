package com.av.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfTwoIntegerPair {

    private static List<int[]> getSumOfTwoUniqueElementPairs(int[] arr, int sum) {
        Set<Integer> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for ( int firstElement : arr ){

            // For each number, calculate the complement needed to reach Sum
            int secondElement = sum - firstElement;
            // Check if the complement has been seen before
            // If the complement is already in the set, you have a valid unique pair.
            if (seen.contains(secondElement))
            {
                result.add(new int[]{secondElement, firstElement});
            }
            // Add current number to set
            // Add the current number to the set after checking (ensures unique element use).
            seen.add(firstElement);
        }
        return result;
    }
    private static List<int[]> getSumOfTwoElementPairs(int[] array, int sum) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    if(!duplicateCheck(result, new int[]{array[i], array[j]})){
                        result.add(new int[]{array[i], array[j]});
                    }

                }
            }
        }
        return result;
    }

    private static boolean duplicateCheck(List<int[]> result, int[] ints) {
        for ( int[] arr : result) {
            if(arr[0] == ints[0] && arr[1] == ints[1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int s = 5;
        List<int[]> result = getSumOfTwoElementPairs(arr , s);
        print(result);
        System.out.println("--------------------------------");
        result = getSumOfTwoUniqueElementPairs(arr , s);
        print(result);
    }
    private static void print(List<int[]> result){
        for (int[] arr : result)
            System.out.print(Arrays.toString(arr)+" ");
    }
}
