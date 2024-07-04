package com.av.pattern;

public class DheriPattern {
    private static void printPattern(int n){

        int space = n - 1;
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 0; j < 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 7;
        printPattern(n);
    }
    /*


          *
         ***
        *****
       *******
      *********
     ***********



     */
}
