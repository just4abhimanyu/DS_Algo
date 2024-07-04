package com.av.ds.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayZeroSum {
    public static int maxLen(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            System.out.println(sum+"<----Sum------>"+i);
            //System.out.println(map);
            if (sum == 0) {
               // System.out.println("====================="+i);
                maxLength = i + 1;
            }
            if (map.containsKey(sum)) {
                System.out.println("-->"+(i - map.get(sum)));
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, -4 , -1,1};
        System.out.println(Arrays.toString(arr));
        int maxLen = maxLen(arr);
        System.out.println("maxLen:"+maxLen);
    }
}

