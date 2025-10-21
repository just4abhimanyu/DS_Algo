package com.av.ds.leetcode;
/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    private static int lengthOfLongestSubstring_ByMap(String inputString) {

        Map<Character, Integer> seenChar = new HashMap<>(); // to store the last seen index of characters
        int maxLength = 0; // to store the maximum length of substring found
        int lastUniqueCharSeenIndex = 0; // to store the starting index of current substring without repeating characters

        for(int i = 0; i < inputString.length(); i++){
            char c = inputString.charAt(i); // current character

            if(seenChar.containsKey(c)){ // char is already seen
                lastUniqueCharSeenIndex = Math.max(seenChar.get(c) + 1, lastUniqueCharSeenIndex);
            }
            seenChar.put(c, i); // update the last seen index of char
            maxLength = Math.max(maxLength, i - lastUniqueCharSeenIndex + 1); // calculate max length
            System.out.println(seenChar); // Debug: print the map of seen characters
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String inputString = "aaaaabcbde";
        int maxLength =
                // lengthOfLongestSubstring_by_BruteForce(inputString);
                lengthOfLongestSubstring_ByMap(inputString);

        System.out.println("Length of Longest Substring Without Repeating Characters: " + maxLength);
    }

    private static int lengthOfLongestSubstring_by_BruteForce(String inputString) {
        if (inputString.isBlank()) return 0;
        if (inputString.length() == 1 || inputString.contains(" ")) {
            return 1;
        }
        int maxLength = 0;
        String maxSubstring = "";

        for (int i = 0; i < inputString.length(); i++) {

            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < inputString.length(); j++) {

                char currentChar = inputString.charAt(j);

                if (currentSubstring.indexOf(String.valueOf(currentChar)) == -1) {

                    currentSubstring.append(currentChar);

                    if (currentSubstring.length() > maxLength) {
                        maxLength = currentSubstring.length();
                        maxSubstring = currentSubstring.toString();
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("Max Substring : " + maxSubstring);
        return maxLength;
    }
}
