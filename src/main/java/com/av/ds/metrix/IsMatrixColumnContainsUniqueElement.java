package com.av.ds.metrix;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class IsMatrixColumnContainsUniqueElement {
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
        boolean isUnique = isMatrixColumnContainsUnique(matrix);
        if (isUnique) {
            System.out.println("Matrix Is unique..");

        }else{
            System.out.println("Matrix Is not unique..");
        }

    }

    private static boolean isMatrixColumnContainsUnique(char[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            List<Character> uniqueElements = new ArrayList<>();
            for (int j = 0; j < matrix[i].length; j++) {
                char element = matrix[j][i];
                if (uniqueElements.contains(element)) {
                    return false;
                }else  {
                    if (Character.isDigit(element)) {
                        uniqueElements.add(element);
                    }
                }
            }
            System.out.println(uniqueElements);
        }
        return true;
    }
}
