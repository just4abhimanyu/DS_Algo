package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPair {
    public static int getMaxNumberOfKSumPairByMap(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<nums.length;i++){
            System.out.println(map);
            if(map.containsKey(k-nums[i])){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
                if(map.get(k-nums[i])==0)
                    map.remove(k-nums[i]);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
    public static int getMaxNumberOfKSumPair(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1 , count = 0;

        while(i < j){
            if(nums[i] + nums[j] == k){
                i++;
                j--;
                count++;
            }else if(nums[i] + nums[j] < k){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,5,0};
        int k = 5;
        int maxNumberOfKSumPair = 0;
               // maxNumberOfKSumPair = getMaxNumberOfKSumPair(arr , k);
                maxNumberOfKSumPair = getMaxNumberOfKSumPairByMap(arr,k);
        System.out.println("maxNumberOfKSumPair ="+maxNumberOfKSumPair);

    }
}
