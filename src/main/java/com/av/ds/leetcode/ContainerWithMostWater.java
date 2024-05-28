package com.av.ds.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {

        int maxArea = 0 , left = 0 , right =  height.length -1;
        while(left < right){

            if(height[left] < height[right]){
                maxArea = Math.max(maxArea , Math.min(height[right],height[left])*(right - left));
                left++;
            }else{
                maxArea = Math.max(maxArea , Math.min(height[right],height[left])*(right - left));
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(arr);
        System.out.println("Maximum Area of tanker :"+maxArea);
    }
}
