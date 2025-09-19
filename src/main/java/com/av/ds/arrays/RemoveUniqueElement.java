package com.av.ds.arrays;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;

public class RemoveUniqueElement {

    private static  void removeUniqueElement(int[] array) {

        int uniqueNumber = 0;
        for(int index = 0; index < array.length; index++){

            int element = array[index];
            if(!isElementUnique(array, index, element)){ // check is it unique element

                for(int index2 = index + 1; index2 < array.length - uniqueNumber; index2++){ // shifting array to left
                    array[index2 -1] = array[index2];
                }
                uniqueNumber++; // checking count of unique number
            }
        }
        // make zero at the end of array as per unique element count
        for(int index = array.length - uniqueNumber; index < array.length; index++){
            array[index] = 0;
        }
        // print final array
        print(array, uniqueNumber);
    }
    private static boolean isElementUnique(int[] array, int index, int element) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == element && index != i){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,3,6,7,7,9,9};
        System.out.println("Initial Array : "+Arrays.toString(array));
        removeUniqueElement(array);

    }
    private static void print(int[] array , int numberOfUniqueElements) {
        System.out.print("Final Array : [");
        for(int index = 0; index < array.length - numberOfUniqueElements; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println("]");
    }
}
