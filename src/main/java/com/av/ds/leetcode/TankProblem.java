package com.av.ds.leetcode;

public class TankProblem {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};

        int max = arr[0];
        int lastIndex = arr.length;
        for (int i = 0; i < lastIndex; i++) {
            int fstValue = arr[i];
            for (int j = i +1; j < lastIndex; j++) {
                int secValue  = arr[j];
                int tmp = (fstValue * secValue);
                if( tmp > max){
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
    private static int getMaxWidth(int[] arr){
        int maxHeight = getMaxValue(arr);
        for (int i = 0; i < arr.length; i++) {

        }
        return  0;
    }
    private static int getMaxValue(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
