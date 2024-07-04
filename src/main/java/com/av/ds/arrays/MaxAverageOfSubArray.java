package com.av.ds.arrays;

import java.util.HashMap;

public class MaxAverageOfSubArray {

    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
       // System.out.println();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k - nums[i])){
                count++;
                map.put(k - nums[i], map.get(k - nums[i])-1);
                if(map.get(k - nums[i]) == 0)
                    map.remove(k - nums[i]);
            }else{
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            }
        }
        System.out.println("Map="+map);
        return count;
    }

    public static double findMaxAverage_tc_N(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];

        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
           // System.out.println("="+nums[i]+" : "+nums[i - k]);
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1){
            return nums[0];
        }
        int tmp = 0, count = 0;
        int i = 0 , j = 0 , max = 0 , kSum = 0;
        System.out.println("track len ="+(nums.length -k));
        while(i <= (nums.length -k) && j <= nums.length ){

            if(count == k){

                i++;
                max = (i == 0) ? kSum : Math.max(max, kSum);

                count =0;
                kSum = 0;
                j = i;
            }else {

                kSum += nums[j];
                j++;
                count++;

            }

        }
        return (double) max /k;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,3,3};
        int k = 4;
        double maxAve = findMaxAverage(arr , k);
           // maxAve = findMaxAverage_tc_N(arr , k);
            maxAve = maxOperations(arr , k);
        System.out.println("Max AVG "+maxAve);


    }
}
