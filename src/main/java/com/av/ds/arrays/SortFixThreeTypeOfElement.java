package com.av.ds.arrays;

/*
You have an arrays of zeros (0) , (1) and (2) keep all zeros at the left hand side and all 1 at middle and 2
  to right hand side ?
i.e.: Integer array[] =[2,1,2, 1,2,0,1,0] -> output : [0,0,1,1,1,2,2,2]
 */
public class SortFixThreeTypeOfElement {

    public static void main(String[] args) {
        int[] arr = {2,1,2,1,2,0,1,0,0,2,1,0};
        sortThreeTypeOfElement(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }

    private static void sortThreeTypeOfElement(int[] arr) {
        int zeroIndex = 0; // pointer for next position of zero
        int twoIndex = arr.length -1; // pointer for next position of two
        int currentIndex = 0; // current index

        while (currentIndex <= twoIndex){ // till current index is less than equal to two index

            if(arr[currentIndex] == 0){ // if current element is zero
                // swap with zero index
                swap(arr, currentIndex, zeroIndex);
                zeroIndex++; // move zero index to right
                currentIndex++; // move current index to right
            }else if(arr[currentIndex] == 2){
                // swap with two index
                swap(arr, currentIndex, twoIndex);
                twoIndex--; // move two index to left
                // do not move current index because the swapped element needs to be checked
            }else {
                currentIndex++; // if element is 1 just move current index to right
            }
        }
    }

    private static void swap(int[] arr, int currentIndex, int zeroIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] =  arr[zeroIndex];
        arr[zeroIndex] = temp;
    }
}
