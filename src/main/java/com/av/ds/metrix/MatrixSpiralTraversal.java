package com.av.ds.metrix;

public class MatrixSpiralTraversal {

    private static void spiralTraversal1(int[][] matrix){
        int left = 0 , right = matrix[0].length - 1 ,
                top = 0, bottom = matrix.length - 1;

        while (left <= right && top <= bottom){
            // top element traversal
            traverseLeftToRight(matrix, left, right, top);
            top++;

            // right element traversal
            traverseTopToBottom(matrix, right, top, bottom);
            right--;

            if (top <= bottom) {
                traverseRightToLeft(matrix, left, right, bottom);
                bottom--;
            }
            if (left <= right) {
                traverseBottomToPop(matrix, bottom, top, left);
                left++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {20,30,41,52}
        };
        spiralTraversal1(matrix);

    }
    // top traversal L -> R
    private static void traverseLeftToRight(int[][] matrix, int left, int right , int top) {

        for (int i = left; i <= right; i++) {
            System.out.print(matrix[top][i] + " ");
        }
    }
    // Right element traversal T -> B
    private static void traverseTopToBottom(int[][] matrix, int right, int top, int bottom) {

        for (int i = top; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }
    }
    // bottom element traversal R -> L
    private static void traverseRightToLeft(int[][] matrix, int left, int right, int bottom) {

        for ( int i = right; i >= left; i--) {
            System.out.print(matrix[bottom][i] + " ");
        }
    }

    // Left element traversal from B -> T
    private static void traverseBottomToPop(int[][] matrix, int bottom, int top, int left) {
        for (int i = bottom; i >= top; i--) {
            System.out.print(matrix[i][left] + " ");
        }
    }
}
