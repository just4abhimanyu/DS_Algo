package com.av.ds.leetcode;

public class LCS {


    private static int getLongestCommonSubSequence(String str1 , String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; ++i) {

            for (int j = 1; j <= len2; ++j) {

                if(str1.charAt(i -1) == str2.charAt(j -1)){

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                }else {

                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int LCS = getLongestCommonSubSequence(str1, str2);
        System.out.println("LCS="+LCS);
    }
}
