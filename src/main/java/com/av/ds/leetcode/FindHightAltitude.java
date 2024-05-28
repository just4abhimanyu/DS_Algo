package com.av.ds.leetcode;

public class FindHightAltitude {
    public static int largestAltitude(int[] gain) {

        int i = 0, len = gain.length -1 , sum = 0 , max = 0;
        int[] resArr = new int[len + 1];
        while(i <= len){
            sum += gain[i];
            resArr[i] = sum;
            max = Math.max(max, resArr[i]);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int largestAltitude = largestAltitude(arr);
        System.out.println("Largest Altitude : "+largestAltitude);
    }
}
/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 *
 *
 */