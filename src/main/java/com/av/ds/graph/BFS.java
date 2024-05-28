package com.av.ds.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void addEdge(int source , int destination , int adjacentLen){
        boolean visitedNode[] = new boolean[adjacentLen];
        int[] parentNode = new int[adjacentLen];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visitedNode[source] = true;
        parentNode[source] = -1;
        while (!queue.isEmpty()){
            int parentNodeData = queue.poll();
//            for (int index : ad) {
//
//            }ad
        }
    }
}
