package com.av.company.sumsung;
public class AirplaneGame {

    public static int maxPoints(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int score = 0;

        for (int i = n - 1; i >= 0; i--) {
            int maxPointsInRow = 0;
            int[] detonate = new int[5];

            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    score++;
                } else if (grid[i][j] == 2) {
                    score--;
                }
                System.out.println(i+", " +j+"+maxPointsInRow="+maxPointsInRow+" Grid="+grid[i][j]);
                maxPointsInRow = Math.max(maxPointsInRow, grid[i][j]);

                if (i < n - 5 && grid[i][j] == 2) {
                    detonate[j % 5]++;
                }
            }

            if (score < 0) {
                return -1;
            }

            for (int j = 0; j < 5; j++) {
                score -= detonate[j];
            }

            if (score < 0) {
                return -1;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1 ,2, 0, 0, 1},
                {2 ,0 ,0, 1, 0},
                {0, 1, 2, 0, 1},
                {1, 0, 0, 2, 1},
                {0, 2, 1, 0, 1},
                {0, 1, 2, 2, 2},
                {1, 0, 1, 1, 0}
        };

        System.out.println("Maximum points: " + maxPoints(grid));
    }
}
