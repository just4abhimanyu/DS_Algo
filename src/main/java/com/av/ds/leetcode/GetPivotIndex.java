package com.av.ds.leetcode;

public class GetPivotIndex {
    public static int pivotIndex(int[] nums) {
        int i = 0 ;
        while (i <= nums.length -1){
            int leftSum = leftElementSum(nums , i);
            int rightSum =rightElementSum(nums , i);
            if (leftSum == rightSum){
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int rightElementSum(int[] nums, int i) {
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }

    private static int leftElementSum(int[] nums, int i) {
        int sum = 0;
        for (int j = i; j >= 0; j--) {
            sum += nums[j];
        }
        return sum;
    }
        public static int pivotIndexBestWay(int[] nums) {
            int rightSum=0;
            int leftSum=0;

            for (int num : nums) {
                rightSum += num;
            }

            for(int i=0; i<nums.length; i++){
                rightSum -= nums[i];
                if(rightSum == leftSum){
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int pivotIndex = pivotIndex(arr);
        System.out.println("Pivot index is "+pivotIndex);
    }
}
