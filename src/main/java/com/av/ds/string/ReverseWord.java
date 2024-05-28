package com.av.ds.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
        public String reverseWordsByBestTC(String s) {
            // Trim the input string to remove leading and trailing spaces
            int i = 0, j = s.length() - 1;
            while (i <= j && s.charAt(i) == ' ') i++;   // Find the first non-space character
            while (j >= i && s.charAt(j) == ' ') j--;   // Find the last non-space character
            s = s.substring(i, j + 1);                  // Extract the trimmed substring

            // Split the trimmed string into words based on spaces
            String[] words = s.split("\\s+");           // Tokenize the string into words

            // Initialize the output string
            StringBuilder out = new StringBuilder();

            // Iterate through the words in reverse order
            for (int k = words.length - 1; k > 0; k--) {
                // Append the current word and a space to the output
                out.append(words[k]).append(" ");
            }

            // Append the first word to the output (without trailing space)
            return out.append(words[0]).toString();       // Concatenate the reversed words
        }

//    public String reverseWordsByStream(String s) {
//        return Arrays.asList(s.split(" ")).reversed()
//                .stream()
//                .filter(e -> !e.isEmpty())
//                .collect(Collectors.joining(" ")
//                );
//    }
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strArr = s.split(" ");
        int n = strArr.length -1;
        for(int i = n ; i>=0 ; i--){
            String sptStr = strArr[i].trim();
            if(!sptStr.isEmpty()) {
                result.append(sptStr).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s ="the sky is blue";
        System.out.println("Ori="+s);
        String res = reverseWords(s);
        System.out.println("Res="+res);
    }
}
