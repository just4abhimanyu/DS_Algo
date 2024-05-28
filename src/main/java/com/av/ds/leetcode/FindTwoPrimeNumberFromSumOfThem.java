package com.av.ds.leetcode;

public class FindTwoPrimeNumberFromSumOfThem {

    private static void getTwoPrimeNumberFromSumOfThem(int sum){

        int prime1 = 2; // supposed
        while (prime1 <= sum/2){

            if (IsPrimeNumber.isPrimeNumber(prime1) && IsPrimeNumber.isPrimeNumber(sum - prime1)){
                System.out.println("First Prime number is "+prime1+" and 2nd prime number is "+(sum - prime1));
            }
            prime1++;
        }
    }
    public static void main(String[] args) {
        int sum = 20;
        getTwoPrimeNumberFromSumOfThem(sum);
    }
}
