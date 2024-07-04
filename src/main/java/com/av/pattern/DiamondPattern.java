package com.av.pattern;

public class DiamondPattern {

    private static void printDiamond(int noOfTravel){
        
        int space = noOfTravel -1;
        for (int i = 1; i < noOfTravel; i++) {

            for (int j = 1; j <space ; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 1; j <=2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (int i = 1; i < noOfTravel; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 0; j < 2*(noOfTravel -space) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        printDiamond(n);
    }
    /*

        *
       ***
      *****
     *******
      *****
       ***
        *


     */
}
