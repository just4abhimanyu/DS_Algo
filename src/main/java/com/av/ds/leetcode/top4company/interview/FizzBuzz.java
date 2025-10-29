package com.av.ds.leetcode.top4company.interview;

import java.util.Arrays;

/*
Given an integer, return an array of string where:

arr[i] == "FizzBuzz" if i is divisible by 3 and 5.

arr[i] == "Fizz" if i is divisible by 3.

arr[i] == "Buzz" if i is divisible by 5.

arr[i] == i (as a string) if none of the above conditions are true.

Example 1:
Input: n = 3
Output: ["1","2","Fizz"]
 */
public class FizzBuzz {
    public String[] fizzBuzz(int n) {

                String[] resultArr = new String[n];

                for(int i = 1; i <= n; i++){

                    if(i >= 3 && i % 3 == 0 && i % 5 == 0){
                        resultArr[i -1]= "FizzBuzz";
                    }else if(i >= 3 && i % 3 == 0){
                        resultArr[i-1]= "Fizz";
                    }else if(i >= 5 && i % 5 == 0){
                        resultArr[i-1]= "Buzz";
                    }else{
                        resultArr[i-1]= String.valueOf(i);
                    }

                }
                return resultArr;
    }
    public static void main(String[] args) {
        int n = 3;
        FizzBuzz obj = new FizzBuzz();
        String[] result = obj.fizzBuzz(n);
        System.out.println(Arrays.toString(result));
    }

}
