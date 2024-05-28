package com.av.ds.searching;

public class BinarySearch {

    private static int getElementByBinarySearch(int[] elements, int searchingEle){

        int firstIndex = 0, lastIndex = elements.length-1;

            while ( firstIndex <= lastIndex) {

                int midIndex = firstIndex + (lastIndex -firstIndex)/2;

                if (elements[midIndex] ==searchingEle){
                    return midIndex;
                }
                if(elements[midIndex] < searchingEle){
                    firstIndex = midIndex + 1;
                }else {
                    lastIndex = midIndex -1;
                }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] elements = {2,4,6,7,9,10,13};
        int targetEle = 9;
        int resultIndex = getElementByBinarySearch(elements,targetEle);
        if( resultIndex != -1){
            System.out.println("Index of Searching element "+targetEle+" is "+resultIndex);
        }else {
            System.out.println("Target element "+targetEle+" not found...");
        }
    }
}
