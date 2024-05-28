package com.av.ds.leetcode;

import java.util.Arrays;

public class CountingBit1OfNumber {
    public static int[] countBits(int n) {
        int[] resArr = new int[n+1];
        for (int i = 0; i <=n; i++) {
            char[] charArr = Integer.toBinaryString(i).toCharArray();
            int count = 0;
            for (char c : charArr){
                if(c == '1'){
                    count++;
                }
            }
            resArr[i] = count;
        }
        return resArr;
    }
    public static int[] countBitsBestWay(int n) {
        int[] r=new int[n+1];
        for(int i=1;i<=n;i++){
            System.out.println((i>>1) +":"+(i&1));
            r[i]=r[i>>1]+(i&1);
        }
        return r;
    }
    public static void main(String[] args) {
        int num = 5;
        int[] arr = countBits(num);
        countBitsBestWay(num);
        System.out.println(Arrays.toString(arr));

    }
}
