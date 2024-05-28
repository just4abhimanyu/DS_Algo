package com.av.company.sumsung;
public class AirplaneGame1 {
    public static int maxPoints(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int score = 0;

        // Start the airplane in the middle column of the bottom row
        int row = rows - 1;
        int col = cols / 2;

        // Iterate through each row
        for (int i = rows - 1; i >= 0; i--) {
            // Iterate from left to right if row number is even, otherwise right to left
            int startCol = (i % 2 == 0) ? 0 : cols - 1;
            int endCol = (i % 2 == 0) ? cols : -1;
            int step = (i % 2 == 0) ? 1 : -1;

            for (int j = startCol; j != endCol; j += step) {
                // Update score based on encountered element
                if (grid[row][j] == '1') {
                    score++; // Collect coin
                } else if (grid[row][j] == '2') {
                    score--; // Hit bomb
                    if (score == 0) return -1; // Game over
                }
            }

            // Detonate bombs in the next 5 rows if necessary
            if (i >= 5) {
                for (int k = 0; k < cols; k++) {
                    if (grid[row + 1][k] == '2') {
                        score--; // Reduce score for detonated bomb
                        if (score == 0) return -1; // Game over
                    }
                }
            }

            // Move to the next row
            row--;
        }

        return score;
    }
    public static void main(String[] args) {
        char[][] grid = {
                {1 ,2, 0, 0, 1},
                {2 ,0 ,0, 1, 0},
                {0, 1, 2, 0, 1},
                {1, 0, 0, 2, 1},
                {0, 2, 1, 0, 1},
                {0, 1, 2, 2, 2},
                {1, 0, 1, 1, 0}
        };
        System.out.println("Max:"+maxPoints(grid));
    }
}

