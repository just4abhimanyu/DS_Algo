package com.av.ds.string;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
Example
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0]; // taking first String
        for (int i = 1; i < strs.length; i++) { // start comparing from second string
            String current = strs[i]; // reading string from array
            System.out.println("current: " + current + " -> prefix: " + prefix);
            while (!current.startsWith(prefix)) { /* checking if string is start with and will
                                                    check until its common to current string */
                prefix = prefix.substring(0, prefix.length() - 1); // reducing last char at each iteration
                if (prefix.isEmpty()) // if empty return empty string
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(Arrays.toString(strs));
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println("Longest prefix : "+longestCommonPrefix.longestCommonPrefix(strs));
    }
}
