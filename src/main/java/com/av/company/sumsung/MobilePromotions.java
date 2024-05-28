package com.av.company.sumsung;
import java.util.Arrays;

public class MobilePromotions {

    public static int[][] assignBooths(int[][] areas) {
        int n = areas.length;
        int[][] booths = new int[n][n];

        // Iterate through each cell of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the area is not established by Samsung (marked as 0)
                if (areas[i][j] == 0) {
                    // Find the highest configuration among adjacent areas
                    int maxConfig = findMaxAdjacentConfig(areas, i, j);
                    // Assign the same booth to all areas with the same highest configuration
                    booths[i][j] = maxConfig;
                } else {
                    // If the area is established by Samsung, use its configuration as the booth number
                    booths[i][j] = areas[i][j];
                }
            }
        }

        return booths;
    }

    // Helper method to find the maximum configuration among adjacent areas
    private static int findMaxAdjacentConfig(int[][] areas, int row, int col) {
        int maxConfig = 0;
        int n = areas.length;

        // Define directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Iterate through all adjacent cells
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            // Check if the adjacent cell is within the matrix bounds
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                // Update maxConfig if the configuration of the adjacent cell is higher
                System.out.println("maxConfig="+maxConfig+" Areas="+areas[newRow][newCol]);
                maxConfig = Math.max(maxConfig, areas[newRow][newCol]);
            }
        }

        return maxConfig;
    }

    public static void main(String[] args) {
        int[][] areas = {
                {5, 5, 1,4,4},
                {4, 0, 2,4,2},
                {5, 5, 5,2,2},
                {5,4,3,3,1},
                {1, 3, 3, 2, 1}
        };

        int[][] booths = assignBooths(areas);

        // Print the resulting booths matrix
        for (int[] row : booths) {
            System.out.println(Arrays.toString(row));
        }
    }
}


/**
 Understanding the Problem: We are given an N*N matrix representing different areas, where each cell contains a number between 0 and 5. These numbers represent the configuration or model of mobile phones in each area. A value of 0 indicates that Samsung mobile is not established in that area.

 Objective: Samsung wants to introduce promotions in mobile sales by setting up booths. They plan to group all areas with the same mobile model into a single booth. Additionally, in areas where Samsung mobile is not established (marked as 0), they will consider selling mobiles that are famous in adjacent areas with higher configurations.

 Approach:

 Iterate through each cell of the given matrix.
 For each cell with value 0, find the adjacent areas with the highest configuration.
 Assign the same booth to all areas with the same highest configuration.
 Return the resulting matrix representing the assigned booths.
 Example:
 Let's consider a sample matrix:

 Copy code
 0 2 1
 3 0 2
 1 4 0
 For the cell at position (0, 0), Samsung mobile is not established (marked as 0). We look at adjacent areas and find that the highest configuration is 3. So, we assign booth 3 to this area.
 For the cell at position (0, 1), Samsung mobile is established with configuration 2. We assign booth 2 to this area.
 Similarly, we continue this process for all cells.
 Output:
 The resulting matrix after assigning booths might look like this:

 Copy code
 3 2 1
 3 2 2
 1 4 2
 This approach ensures that booths are assigned based on the configuration of mobile phones in each area, and Samsung can effectively promote their mobile sales by grouping areas with the same mobile model into a single booth.




 */
