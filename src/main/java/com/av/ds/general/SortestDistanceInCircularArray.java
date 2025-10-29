package com.av.ds.general;

public class SortestDistanceInCircularArray {

    public static int findShortestDistance(int[] arr, int target, int startIndex) {
        int n = arr.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                int clockwiseDistance = (i - startIndex + n) % n;
                int counterClockwiseDistance = (startIndex - i + n) % n;
                int currentMinDistance = Math.min(clockwiseDistance, counterClockwiseDistance);
                minDistance = Math.min(minDistance, currentMinDistance);
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4};
        int target = 4;
        int startIndex = 0;
        int distance = findShortestDistance(arr, target, startIndex);
        if (distance < 0) {
            System.out.println("Target not found in array.");
        } else {
            System.out.println("Target found in forward direction move of array at : "+distance);
        }
    }
}
