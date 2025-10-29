package com.av.ds.leetcode.top4company.interview;
/*
https://leetcode.com/problems/factorial-trailing-zeroes/description/

Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {

        int count = 0;

        int factPowerOfFive = 5;

        while(n >= factPowerOfFive){
            count += n / factPowerOfFive;
            factPowerOfFive *=5;
        }
        return count;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        int n = 25;
        int trailingZeroes = factorialTrailingZeroes.trailingZeroes(n);
        System.out.println("Number of trailing zeroes in "+n+"! is : "+trailingZeroes);
    }
}
