package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSumIndex {


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] resultArr = getIndexOfTwoSumNumber(arr,target);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] getIndexOfTwoSumNumber(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // use map to store index

        for (int i = 0; i < arr.length; i++) {
            int complementNumber = target - arr[i]; // getting next value of it

            if(map.containsKey(complementNumber)) {
                return new int[] {map.get(complementNumber), i};
            }
            map.put(arr[i], i);

        }
        return new int[]{};
    }
}
