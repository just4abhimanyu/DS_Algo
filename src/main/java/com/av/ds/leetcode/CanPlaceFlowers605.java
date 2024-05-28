package com.av.ds.leetcode;

public class CanPlaceFlowers605 {
    private static boolean canPlaceFlower(int[] flowerPlace , int noOfPosition){
        for (int i = 0; i < flowerPlace.length; i++ ){
            if(flowerPlace[i] == 0){
                int nextPlace = (i == flowerPlace.length -1) ? 0 : flowerPlace[i+1];
                int prevPlace = i == 0 ? 0 : flowerPlace[i -1];
                if (nextPlace == 0 && prevPlace == 0){
                    flowerPlace[i] = 1;
                    noOfPosition--;
                }
            }

        }
        return noOfPosition == 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 2;
        if(canPlaceFlower(arr,n)){
            System.out.println("Flower can be planted at "+n+" position");
        }else {
            System.out.println("Flower can't be planted at "+n+" position");
        }

    }
}
