package com.av.ds.string;

import java.util.Arrays;

public class SortStringsByRadixAlgo {

    public static void main(String[] args) {
        String[] arr = { "cat", "bat", "dog", "ant", "car" };
        int maxLen = arr[0].length(); // assume all strings are same length

        radixSort(arr, maxLen);

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    static void radixSort(String[] arr, int maxLen) {
        for (int pos = maxLen - 1; pos >= 0; pos--) { // Loops through character positions in the strings from rightmost to leftmost.
            countingSortByCharacter(arr, pos); // For each character position, calls a stable counting sort to order the strings by that character.
        }
    }

    static void countingSortByCharacter(String[] arr, int charPos) {
    System.out.println("------- start -------");
        int n = arr.length; // Number of strings to sort.
        int range = 26; // for 'a' to 'z' , Only lowercase English letters ('a'-'z').
        String[] output = new String[n]; // Array to store sorted results temporarily.
        System.out.println("output :" + Arrays.toString(output));
        int[] count = new int[range]; // Stores the frequency of each character (a-z) at the target position.
        System.out.println("output :" + Arrays.toString(count));

        // Count occurrences of each character at charPos
        for (String s : arr) {
            int idx = s.charAt(charPos) - 'a';  // Gets the character at position charPos by s.charAt(charPos)
                                                // Converts that character to an index from 0 (‘a’) to 25 (‘z’) using - 'a'
            System.out.println(s + " <=> idx :" +idx + " <=> Char :"+s.charAt(charPos));
            count[idx]++; // Increments count[idx] to track how many times that character appears.
        }
        System.out.println("count after for 1 :" + Arrays.toString(count));

        // Modify count[] so that it contains positions
        // Transforms the count array into a prefix sum (cumulative count) array.
        //Now, count[i] will indicate where the next occurrence of the ith character should be placed in the output array.
        //This step is key for the stability of counting sort.
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("count after for 2 :" + Arrays.toString(count));

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = arr[i].charAt(charPos) - 'a';
            output[--count[idx]] = arr[i];
        }
        System.out.println("count after for 3 :" + Arrays.toString(count));
        System.out.println("count after for 3 :" + Arrays.toString(output));
        // Copy output to arr
        // Copies all sorted strings from "output" back to arr, updating the original array for the next digit/character position in the radix sort passes.
        System.arraycopy(output, 0, arr, 0, n);
    }
}
