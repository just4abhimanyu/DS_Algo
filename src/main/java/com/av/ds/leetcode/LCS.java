package com.av.ds.leetcode;

import java.util.Arrays;

public class LCS {


    private static int[][] getLongestCommonSubSequence(String str1 , String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= len1; ++i) {

            for (int j = 1; j <= len2; ++j) {

                if(str1.charAt(i -1) == str2.charAt(j -1)){
                    result.append(str1.charAt(i -1));
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                }else {

                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println("Result char seq is : "+result);
        return dp;
    }
    private static void print(int[][] dp){
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "edcba";
        int[][] dp = getLongestCommonSubSequence(str1, str2);
        print(dp);
        System.out.println("LCS char count is : "+dp[str1.length()][str2.length()]);
    }

}
