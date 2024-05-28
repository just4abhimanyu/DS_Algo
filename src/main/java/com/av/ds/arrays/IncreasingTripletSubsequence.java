package com.av.ds.arrays;

import java.util.Arrays;

public class IncreasingTripletSubsequence {

        public static boolean increasingTripletWithAny_NplusOne(int[] nums) {
            if (nums == null || nums.length < 3) {
                return false;
            }
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            System.out.println("a="+a+" b="+b);

            for (int num : nums) {
                if (num <= a) {
                    a = num;
                } else if (num <= b) {
                    b = num;
                } else {
                    return true;
                }
                System.out.println("a="+a+" b="+b);
            }

            return false;
        }

    public static boolean increasingTripletInSequence(int[] nums) {
        int startIndex = 0;
        int[] ans = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            ans[startIndex++] = nums[i] - nums[i-1];
        }
        System.out.println("ANS="+ Arrays.toString(ans));
        int n = ans.length -1;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] > 0){
                if(i + 2 <= n){
                    if (ans[i+1] >=0 && ans[i+2] >=0) {
                        return true;
                    }
                }else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println("ANS="+ Arrays.toString(arr));
        boolean b = false;
               // b = increasingTripletInSequence(arr);
                b = increasingTripletWithAny_NplusOne(arr);
        if(b){
            System.out.println("Array has incremental of three sequence....");
        }else {
            System.out.println("Array has not incremental of three sequence....");
        }
    }
}
