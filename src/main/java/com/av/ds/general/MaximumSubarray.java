package com.av.ds.general;

import java.util.Arrays;

public class MaximumSubarray {


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrayBestWay(nums));
    }

    public static int maxSubArrayBestWay(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // Stores the maximum sum found so far
        int currentSum = 0;             // Stores the sum of the current subarray being explored

        for (int num : nums) {
            currentSum += num; // expand current subarray by including num

            if (currentSum > maxSum) {
                maxSum = currentSum;  // update the global maximum if needed
            }

            if (currentSum < 0) {
                currentSum = 0; // discard negative sum; start fresh
                /*
                If currentSum becomes negative, it can only reduce the sum of any future subarray.
                So, we reset currentSum to 0 and start a new subarray from the next element.
                 */
            }
        }
        return maxSum;
    }
    public int maxSubArray(int[] nums) { // faster
        int n=nums.length;
        int max=nums[0],sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=(sum>max)?sum:max;
            if(sum<0)
                sum=0;
        }
        return (int)max;
    }
}
