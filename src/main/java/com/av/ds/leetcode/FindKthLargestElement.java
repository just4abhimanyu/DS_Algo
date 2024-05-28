package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargestElement {
    private static int getKthLargestElementByPriorityQueue(int[] arr , int k){
        // Create a min heap (priority queue) of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        // Add the first k elements to the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }
        System.out.println("Min Heap :"+minHeap);
        // For the remaining elements, if any element is larger than the smallest element in the min heap,
        // remove the smallest element and add the larger element to the min heap

        for (int i = k; i < arr.length; i++) {

            if(arr[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        // The root of the min heap will be the Kth largest element
        return minHeap.peek();
    }
    private static int getKthLargestElementBYSorting(int[] arr , int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    } 
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 4;
        int kthLargestElement = getKthLargestElementByPriorityQueue(arr , k);
        System.out.println(k+"th Largest element is "+kthLargestElement);
    }
}
