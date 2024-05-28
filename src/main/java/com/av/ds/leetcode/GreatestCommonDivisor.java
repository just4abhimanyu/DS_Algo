package com.av.ds.leetcode;

public class GreatestCommonDivisor {
    public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd = getGcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    public static int getGcd(int a, int b) {
        System.out.println("a="+a+" b="+b);
        if (b==0) return a;

        return getGcd(b,a%b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABDC";
        String result = gcdOfStrings(str1,str2);
        //int gcd = getGcd(str1.length(), str2.length());
        ///String result = str1.substring(0, gcd);
        System.out.println("Result="+result);
    }
}
