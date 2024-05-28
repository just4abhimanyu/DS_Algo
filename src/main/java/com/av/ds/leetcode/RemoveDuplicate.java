package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int removeDuplicatesFromSortedArray(int[] nums) { // Best Way
        int i=0, len = nums.length -1;

        for( int j = 1; j < len; j++ ){

            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            System.out.println(Arrays.toString(nums));
        }
        for (int j = 0; j <i+1; j++) {
            System.out.print(nums[j] +" ");
        }
        return i+1;
    }
private static void removeDuplicatesFromArrayByStreamAPI(int[] arr){
        System.out.println("Stream:"+Arrays.toString(Arrays.stream(arr).distinct().toArray()));
}
private static  void  removeDuplicateFromArrayByCollection(int[] arr){
    Set<Integer> resSet = new HashSet<>(); // just to check if contains
    int index = 0;

    for (int i = 0; i < arr.length; i++) {

         if (resSet.add(arr[i])) {
            arr[index] = arr[i];
            index++;
        }
    }
    System.out.println("Collection Res Arr:"+Arrays.toString(arr)+" : "+resSet);
}
    private static  void  removeMoreThanTwoDuplicateFromArrayByCollection(int[] arr){
        System.out.println("Orig="+Arrays.toString(arr));
        int count = 1, j = 0;
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] == arr[j] && count < 2) {
                count++;
                arr[j++] = arr[i];
            } else if (arr[i] != arr[j]) {

                count = 1;
                arr[j++] = arr[i];
            }
        }
        System.out.println("Collect more than two dup Res Arr:"+Arrays.toString(arr)+" : ");
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,3,3};
        removeDuplicatesFromSortedArray(arr);
     //   System.out.println("Res Arr:"+Arrays.toString(arr));
    //    removeDuplicatesFromArrayByStreamAPI(arr);
       // removeDuplicateFromArrayByCollection(arr);
        //removeMoreThanTwoDuplicateFromArrayByCollection(new int[]{1,1,1,2,3,3,3});

    }
}
