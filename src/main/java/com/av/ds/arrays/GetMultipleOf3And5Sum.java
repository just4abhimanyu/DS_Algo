package com.av.ds.arrays;

public class GetMultipleOf3And5Sum {
    public static void getMultiple_O_N(int n){
        long mThree = (n-1)/3;
        long mFive = (n-1)/5;
        long mFiftin = (n-1)/15;
        long sum = (3*(mThree*(mThree+1))/2);
        sum += (5*(mFive*(mFive+1))/2);
        sum -= (15*(mFiftin*(mFiftin+1))/2);

        System.out.println(sum);
    }

    public static void main(String[] args) {
        getMultiple_O_N(10000);
    }
}
