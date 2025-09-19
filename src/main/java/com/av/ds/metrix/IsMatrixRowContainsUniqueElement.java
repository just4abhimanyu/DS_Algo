package com.av.ds.metrix;

import java.util.ArrayList;
import java.util.List;

public class IsMatrixRowContainsUniqueElement {


    private static boolean isMatrixRowContainsUnique(char[][] matrix) {

        for (char[] rows : matrix) {

            List<Character> uniqueElement = new ArrayList<>();
            for (char c : rows) {

                if (uniqueElement.contains(c)) {
                    return false;
                } else {
                    if (Character.isDigit(c)) {
                        uniqueElement.add(c);
                    }
                }
            }
            System.out.println(uniqueElement);
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] matrix = new char[][]
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','7','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}

                };
        boolean isUnique = isMatrixRowContainsUnique(matrix);

        if (isUnique) {
            System.out.println("Matrix Is unique..");

        }else{
            System.out.println("Matrix Is not unique..");
        }
        boolean isUniqueInteger = isUniqueRows(matrix, 0,0);
    }
    public static boolean isUniqueRows(char[][] inputSudoku ,int row, int col  ){

        List<Character> columns = new ArrayList<>();
        while(col < inputSudoku.length && row < inputSudoku.length){

            char data = inputSudoku[col][row];
            if(Character.isDigit(data)){

                if(columns.contains(data)){

                    return false;

                }else{

                    columns.add(data);

                }
            }
            row++;
        }
        System.out.println(columns);
        return true;

    }
}
