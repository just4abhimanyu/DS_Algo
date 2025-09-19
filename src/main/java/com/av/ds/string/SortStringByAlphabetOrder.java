package com.av.ds.string;

import java.util.Arrays;

public class SortStringByAlphabetOrder {

    public static void main(String[] args) {

        String[] strArr = {"xyz","cat","xym", "bat","dog"};
        System.out.println("-----------------Start Sort String By Alphabet Ascending Order -----------------------------");
        System.out.println("Before sorting : "+Arrays.toString(strArr));
        sortInAlphabetAscendingOrder(strArr);
        System.out.println("After sorting  : "+Arrays.toString(strArr));
        System.out.println("-----------------End Sort String By Alphabet Ascending Order -------------------------------");
        System.out.println("\n\n-----------------Start Sort String By Alphabet Descending Order -----------------------------");
        System.out.println("Before sorting : "+Arrays.toString(strArr));
        sortInAlphabetDescendingOrder(strArr);
        System.out.println("After sorting  : "+Arrays.toString(strArr));
        System.out.println("-----------------End Sort String By Alphabet Descending Order -------------------------------");

    }

    private static void sortInAlphabetAscendingOrder(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {

            for (int j = i + 1; j < strArr.length; j++) {

                if(strArr[i].compareTo(strArr[j]) > 0){

                    swap(strArr, i, j); // swap the string in increasing order

                }
            }

        }
    }

    private static void sortInAlphabetDescendingOrder(String[] strArr) {

        for (int i =0; i <strArr.length; i++){

            for (int j = i + 1; j <strArr.length; j++){

                if(!isGreaterChar(strArr[i], strArr[j])){
                    swap(strArr, i, j); // swap the string in decreasing order
                }
            }
        }
    }

    private static boolean isGreaterChar(String leftString, String rightString) {

        int len = Math.min(leftString.length(), rightString.length()); // get min length string
        for (int k = 0; k < len; k++) {

        System.out.println("left char ->"+leftString.charAt(k)+"["+(int)leftString.charAt(k)+"] : right char ->"+rightString.charAt(k)+"["+(int)rightString.charAt(k)+"]");

        if (leftString.charAt(k) > rightString.charAt(k)) { //  comparing char based on ascii value
            return true;
          } else if ( leftString.charAt(k) < rightString.charAt(k) ) { //  comparing char based on ascii value
            return false;
          }
        }
        return leftString.length() > rightString.length(); // check if both string has unequal string
    }

    private static void swap(String[] strArr, int left, int right) {
        String tmp = strArr[left];
        strArr[left] = strArr[right];
        strArr[right] = tmp;
    }
}
