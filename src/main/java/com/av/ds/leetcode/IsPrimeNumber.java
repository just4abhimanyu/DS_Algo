package com.av.ds.leetcode;

public class IsPrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        System.out.println("Squire root : "+Math.sqrt(num));
        for (int i = 2; i <= Math.sqrt(num); i++) { // Math.sqrt(num) ==> give squire root of number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeNumber(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i*i < num ; i = i + 6) {
            if (num % i == 0 || num % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 2;
        if(isPrime(num)){
            System.out.println(num+" is a prime number!");
        }else {
            System.out.println(num+" is not a prime number!");
        }
    }
}
