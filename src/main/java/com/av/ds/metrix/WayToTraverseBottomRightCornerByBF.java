package com.av.ds.metrix;

public class WayToTraverseBottomRightCornerByBF {

    public static void main(String[] args) {
        int rowNumber = 3;
        int colNumber = 4;

        int numberOfWay = wayToTraverseBottomLeft(rowNumber, colNumber);
        System.out.println("Number of way to traver : "+numberOfWay);
    }

    private static int wayToTraverseBottomLeft(int row, int col) {

        if(row == 1 || col == 1){

            return 1;

        }else {

            return wayToTraverseBottomLeft(row -1 , col) + wayToTraverseBottomLeft(row, col -1);

        }
    }
}
