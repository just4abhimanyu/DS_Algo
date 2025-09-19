package com.av.ds.leetcode;

public class MaxProductOfSubArray {


    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4, -3};

        int maxProductOfSubArray = getMaxProductOfSubArray(nums);
        System.out.println("Maximum product of sub array is : "+maxProductOfSubArray);
    }

    private static int getMaxProductOfSubArray(int[] nums) { // dynamic programming
        int min = nums[0]; // pointer 1
        int max = nums[0]; // pointer 2
        int result = 0; // for result store
        for (int i = 1; i < nums.length; i++) {

           int current = nums[i]; // to get current data
           int currentMax = current * max;  //  getting current max value
           int currentMin = current * min; // getting current min value

           min = Math.min(current, Math.min(currentMin,currentMax)); // updating min
           max = Math.max(current, Math.max(currentMin,currentMax)); //  updating max
           System.out.println(current + " " + currentMax + " " + currentMin);

           result = Math.max(max, result); // updating result

        }


        return result;
    }
}
