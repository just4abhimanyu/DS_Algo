package com.av.ds.arrays;

import java.util.Arrays;

/**
 * You are given an array of integer sar of size n and a target sum S.
 *
 *  Write a function findPairsWithSum(int[] arr, int S) that finds all unique pairs of elements in the array that add up to the target sum S.
 * Requirements:
 * The function should return a list of pairs (each pair contains two integers from the array that sum up to S).
 * Each pair should be unique, and the order of pairs does not matter.
 * You may assume the array does not contain duplicate elements.
 * Example:
 * Input: arr = [1, 2, 3, 4, 5], S = 5
 * Output: [(1, 4), (2, 3)]
 */
public class MergeTwoSortedArrays {

    private static void merge(int[] array1, int[] array2) {
        int totalLen = array1.length + array2.length;
        int[] finalArray = new int[totalLen];
        int arr1Index = 0;
        int arr2Index = 0;
        int finalArrayIndex = 0;
        while (arr1Index < array1.length &&   arr2Index < array2.length) {

           if (array1[arr1Index] < array2[arr2Index]) {
               finalArray[finalArrayIndex++] = array1[arr1Index++];
           } else {
               finalArray[finalArrayIndex++] = array2[arr2Index++];
           }
        }
            while ( arr1Index < array1.length){
                finalArray[finalArrayIndex++] = array1[arr1Index++];
            }
            while ( arr2Index < array2.length){
                finalArray[finalArrayIndex++] = array2[arr2Index++];
        }
        System.out.println(Arrays.toString(finalArray));

    }

    public static void main(String[] args) {
        int[] array1 = {1,3,5,6};
        int[] array2 = {2,4,5,7};
        merge(array1, array2);
    }
}
