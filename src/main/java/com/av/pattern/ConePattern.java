package com.av.pattern;

public class ConePattern {

    private static void printConePattern(int n){
        int space = 1;
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printConePattern(n);
        /*

         *********
          *******
           *****
            ***
             *

         */
    }
}
