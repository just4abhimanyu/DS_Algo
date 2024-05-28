package com.av.ds.queue;


import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {

    static class Element{
        int value;
        int row;
        int column;

        public Element(int value, int row, int column) {
            this.value = value;
            this.row = row;
            this.column = column;
        }
    }

    private static int kthSmallest(int[][] matrix , int kthEle){

        int len = matrix.length;
        // Min-Heap to keep track of the smallest elements
        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        // add first element of matrix
        for (int i = 0; i < len; i++) {
            minHeap.offer(new Element(matrix[i][0] , i , 0));
        }

        // Extract the smallest element from the heap k times
        Element current = null;
        for (int i = 0; i < kthEle; i++) {
            current = minHeap.poll();
            int nextColumn = current.column + 1;
            if(nextColumn < len){
                minHeap.offer(new Element(matrix[current.row][nextColumn],current.row ,nextColumn));
            }
        }
       // assert current != null;
        return current.value;
    }

    public static void main(String[] args) {
        // Time Complexity : O(klogN)
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        int result = kthSmallest(matrix, k);
        System.out.println("The " + k + "-th smallest element is: " + result);

    }
}
