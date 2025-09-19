package com.av.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {


    public static void main(String[] args) {
        int[]  arr = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        List<List<Integer>> result = getTripletSumZero(arr);

        System.out.println(result);

    }

    private static List<List<Integer>> getTripletSumZero(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr.length && arr[i] <= 0; i++){

            if(i == 0 || arr[i] != arr[i - 1]) {

                twoSum(arr, i, result);

            }
        }
        return result;
    }

    private static void twoSum(int[] arr, int i, List<List<Integer>> result) {
        int left = i + 1;
        int right = arr.length -1;

        while(left < right){

            System.out.println(i + " "+left+" "+ right);

            int sum = arr[i] + arr[left] + arr[right];

            if(sum < 0){

                left++;

            }else if(sum > 0){

                right--;

            }else{

                result.add(Arrays.asList(arr[i], arr[left++], arr[right--]));

                while(left < right && arr[left] == arr[left -1]){
                    ++left;
                }
            }

        }
    }
}
