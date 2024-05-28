package com.av.ds.series;

import java.util.Arrays;

public class FibonacciSeries {
    static int i = 0, j = 1;
    private static int[] getFibonacciSeries(int count){
        int[] tmp = new int[count];
        tmp[0] = 0;
        tmp[1] = 1;
        for (int i = 2; i < count; i++) {
            tmp[i] = tmp[i -2] + tmp[i -1];
        }
        return tmp;
    }
    private static void getFibonacciSeriesByRecursion(int numOfEle , int[] arr , int index){
        //System.out
           if(  index < arr.length){
               i = arr[index -2];
               j = arr[index -1];
               arr[index] = i + j;

               getFibonacciSeriesByRecursion(numOfEle -1 , arr,index+1);
           }
    }
    public static void main(String[] args) {
        int count = 10;
        int[] resArr = new int[count];
        resArr[1] = 1;
        int[] res = getFibonacciSeries(count);
        System.out.println(Arrays.toString(res));
        getFibonacciSeriesByRecursion(count,resArr,2);
        System.out.println(Arrays.toString(resArr));
    }
}
