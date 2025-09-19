package com.av.ds.general;

import java.util.Arrays;

public class RemoveElementFromArray {

    public int removeElement(int[] nums, int val) {

        int numberOfShift = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){ // checking non-matching with val
                nums[numberOfShift++] = nums[i]; // shifting non matching val
            }
        }
        System.out.println("Shift is " + numberOfShift);
        System.out.println("Final array :"+Arrays.toString(nums));
        return  numberOfShift;

    }


    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        System.out.println(Arrays.toString(nums));
        RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
        System.out.println("Number of element removed : "+ removeElementFromArray.removeElement(nums, 3));
    }
}
