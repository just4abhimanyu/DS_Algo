package com.av.ds.leetcode;

public class MinElementOfRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{10,-1,0,2,3,4,5,6,7,8,9};
        int minElement = getMinElementOfRotatedSortedArray(nums);
        System.out.println("Minimum element of given array is :"+minElement);
    }

    private static int getMinElementOfRotatedSortedArray(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int minElement = nums[0];
        while ( leftIndex <= rightIndex) {

            if(nums[leftIndex] < minElement) {
                minElement = Math.min(nums[leftIndex], minElement);
            }
            int mid = leftIndex + (rightIndex - leftIndex)/2;

            minElement = Math.min(minElement, nums[mid]);

            if(nums[leftIndex] <= nums[mid]){ // left element is less means, left side of mid element is in sorted order
                leftIndex = mid+1; // so we have to move left pointer to right side
            }else { // otherwise right element of mid is in sorted order
                rightIndex = mid-1;
            }

        }

        return minElement;
    }
}
