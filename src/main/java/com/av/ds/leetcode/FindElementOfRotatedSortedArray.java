package com.av.ds.leetcode;

import java.util.Arrays;

public class FindElementOfRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{10,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        int target = 1;
        int elementIndex = findElementIndexOfRotatedSortedArray(nums,target);
        System.out.println("Index of ["+target+"] in rotated sorted array "+ Arrays.toString(nums)+" is " +elementIndex);
    }

    private static int findElementIndexOfRotatedSortedArray(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            }

            // Check which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // search left half
                } else {
                    left = mid + 1; // search right half
                }
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // search right half
                } else {
                    right = mid - 1; // search left half
                }
            }
        }
        return -1; // not found
    }
}
