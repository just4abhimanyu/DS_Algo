package com.av.ds.general;
/*
Given an array arr[] of N integers where arr[i] is the height of the ith chocolate and
all the chocolates are 1 unit wide, the task is to find the maximum area for any
square made from the chocolates when the chocolates can be arranged in any order.
Examples:

Input: arr[] = {1, 3, 4, 5, 5}
Output: 9
Square with side = 3 can be obtained
from either {3, 4, 5} or {4, 5, 5}.

Input: arr[] = {6, 1, 6, 6, 6}
Output: 16

 */
public class GetSquireFromGivenHeight {

    private int getMaxSquare(int[] arr, int n) {
        int maxSquare = 0;
        for (int i = 0; i < n; i++) {
            int side = Math.min(arr[i], n - i);
            maxSquare = Math.max(maxSquare, side * side);
        }
        return maxSquare;
    }

    public static void main(String[] args) {
        GetSquireFromGivenHeight obj = new GetSquireFromGivenHeight();
        int[] arr = {1, 6, 6, 6, 6};
        int n = arr.length;
        System.out.println("Max Square Area: " + obj.getMaxSquare(arr, n));
    }
}
