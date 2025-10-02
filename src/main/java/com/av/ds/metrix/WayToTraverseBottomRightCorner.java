package com.av.ds.metrix;

public class WayToTraverseBottomRightCorner {

    public static void main(String[] args) {
        int rowLen = 3;
        int colLen = 3;
        int[][] matrix = new int[rowLen][colLen];
        int noOfWay = numberOfWayTraversal(0, 0 , rowLen, colLen, matrix);
        System.out.println("Number of way traversal :"+noOfWay);
    }

    private static int numberOfWayTraversal(int rowIndex, int colIndex, int rowLen, int colLen, int[][] metrix) {

        if(rowIndex >= rowLen || colIndex >= colLen){
            return 0;
        }

        if(rowIndex == rowLen -1 && colIndex == colLen -1 ){
            return 1;
        }else {

            int right = numberOfWayTraversal(rowIndex, colIndex + 1, rowLen, colLen, metrix);
            int left = numberOfWayTraversal(rowIndex + 1, colIndex, rowLen, colLen, metrix);

            System.out.println(right + " : " + left);

            metrix[rowIndex][colIndex] = right + left;

            return left + right;
        }
    }
}
