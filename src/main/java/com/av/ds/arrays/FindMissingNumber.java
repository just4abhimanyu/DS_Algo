package com.av.ds.arrays;

public class FindMissingNumber {

    private static int getMaxNumber(int[] arr){
        int max =0;
        for (int val : arr){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
    private static String getMissingNumber(int[] arr){
        int[] tmpArr = new int[getMaxNumber(arr)];

        StringBuilder resultStr = new StringBuilder();
        for (int j : arr) {
            tmpArr[j -1] = 1;
        }
        for (int i = 0; i< tmpArr.length; i++){
            if(tmpArr[i] == 0 ){
                resultStr.append(i+1).append(",");
            }
        }
        return resultStr.substring(0,resultStr.length() -1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9};
        String missingNumber = getMissingNumber(arr);
        System.out.println("Missing number is :"+missingNumber);
    }
}
