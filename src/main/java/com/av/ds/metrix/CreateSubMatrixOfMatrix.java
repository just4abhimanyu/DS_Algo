package com.av.ds.metrix;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
/**
 Check validity of sudoku problem:
 Determine if a 9 x 9 Sudoku board is valid.
 The rules that need to be checked if the Sudoku grid is valid are :

 Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 Example 1 :
 {
 {'5','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}

 }
 Output: true

 Example 2 :
 {{'8','3','.','.','7','.','.','.','.'},
 {'6','.','.','1','9','5','.','.','.'},
 {'.','9','8','.','.','.','.','6','.'},
 {'8','.','.','.','6','.','.','.','3'},
 {'4','.','.','8','.','3','.','.','1'},
 {'7','.','.','.','2','.','.','.','6'},
 {'.','6','.','.','.','.','2','8','.'},
 {'.','.','.','4','1','9','.','.','5'},
 {'.','.','.','.','8','.','.','7','9'}}
 Output: false

 *******************************************************************************/

public class CreateSubMatrixOfMatrix
{
    public static void main(String[] args) {
        int subMatrixRowLength = 3;
        int subMatrixColLength = 3;

        char[][] inputSudoku = new char[][]
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}

                };
        //Expected answer is : true
        boolean isSubMatrixHaveUniqueElements = divideMatrixToSubMatrix(inputSudoku, subMatrixRowLength, subMatrixColLength);
        System.out.println("Is given sudoku problem vablid ? : " + isSubMatrixHaveUniqueElements);
    }
    static boolean divideMatrixToSubMatrix(char[][] inputSudoku, int subMatrixRowLength, int subMatrixColLength){
        int matrixRowSize = inputSudoku.length;
        int numberOfRowSubMatrix = matrixRowSize/subMatrixRowLength;
        int numberOfColSubMatrix = inputSudoku[0].length/subMatrixColLength;
        System.out.println("Sub Matrix Row Size: " + numberOfRowSubMatrix + " Sub Matrix Col Size: " + numberOfColSubMatrix);
        int totalCount = 0;


        for(int blockRow = 0; blockRow < numberOfRowSubMatrix; blockRow++){
            for(int blockCol = 0; blockCol < numberOfColSubMatrix; blockCol++){
                totalCount++;
                System.out.println("Sub-matrix (" + blockRow + "," + blockCol + "):");
                List<Character> uniqueElements = new ArrayList<>();

                for(int divRow = blockRow*numberOfRowSubMatrix; divRow <(blockRow + 1)*numberOfRowSubMatrix; divRow++){

                    for ( int divCol = blockCol*numberOfColSubMatrix; divCol < (blockCol + 1)*numberOfColSubMatrix; divCol++){

                        System.out.print(inputSudoku[divRow][divCol]+ " ");
                        if(Character.isDigit(inputSudoku[divRow][divCol])){

                            if(uniqueElements.contains(inputSudoku[divRow][divCol])){
                                return false;
                            }else {
                                uniqueElements.add(inputSudoku[divRow][divCol]);
                            }
                        }
                    }
                    System.out.println();
                }
                System.out.println();

            }
        }
        System.out.println("Total sub-matrix count: " + totalCount);
        return true;
    }
}



