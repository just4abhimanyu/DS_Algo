package com.av.ds.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
//1,2,3,0,0,0}
    //{2,5,6}
    private static int[] mergeSortedArray(int[] arry1, int m, int[] arry2, int n){
        int fstArrLen = m - 1;
        int secArrLen = n - 1;
        int targetArrLen = m + n -1;
        while(secArrLen >= 0){
            System.out.println(arry1[fstArrLen]+":"+arry2[secArrLen]);
            if(arry1[fstArrLen] > arry2[secArrLen]){
                System.out.println("Index : "+fstArrLen);
                arry1[targetArrLen--] = arry1[fstArrLen--];
              //  System.out.println(targetArrLen-- +" "+fstArrLen--);
            }else {
                arry1[targetArrLen--] = arry2[secArrLen--];
              //  System.out.println(targetArrLen-- +" "+fstArrLen--);
            }
        }

        return  arry1;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            System.out.println(Arrays.toString(nums1));
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,0,0,0};
        int arr1Len = 3;
        int[] arr2 = new int[]{1,5,6};
        int arr2Len = 3;
        //int[] resArr = mergeSortedArray(arr1 , arr1Len , arr2 , arr2Len);
        //System.out.println(Arrays.toString(resArr));
merge(arr1 , arr1Len , arr2 , arr2Len);
/**
[1, 2, 3, 0, 0, 0]
[1, 2, 3, 0, 0, 6]
[1, 2, 3, 0, 5, 6]
[1, 2, 3, 3, 5, 6]
[1, 2, 2, 3, 5, 6]
[1, 1, 2, 3, 5, 6]
 **/

    }
}
