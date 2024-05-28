package com.av.ds.arrays;

import java.util.Arrays;

public class MoveZeroAtEnd {
        public static void moveZeroes_OMS(int[] nums)
        {
            int i = 0;
            for (int num : nums)
            {
                if (num != 0)
                {
                    nums[i] = num;
                    i++;
                }
            }

            while (i <= nums.length - 1)
            {
                nums[i] = 0;
                i++;
            }

        }
    public static void moveZeroes_1MS(int[] nums) {
        int i = 0, index = 0;
        int len = nums.length;
        int[] tmp = new int[len];

        while (i < len){
            if(nums[i] != 0){
                tmp[index++] = nums[i];
            }
            i++;
        }
        i =0;
        while (i < len){
            nums[i] = tmp[i];
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0};
        moveZeroes_OMS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
