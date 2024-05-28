package com.av.ds.leetcode;

import java.util.List;

/**
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 */
public class VisitRoom {
    private static boolean[] visited;
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms , 0);
        for(boolean isVisited : visited) {
            if(!isVisited) {
                return false;
            }
        }

        return true;
    }
    private static void dfs(List<List<Integer>> rooms , int roomNo){

        for(int vRoomNo : rooms.get(roomNo)){

            if(!visited[vRoomNo]){
                visited[vRoomNo] = true;
                dfs(rooms , vRoomNo);
            }

        }
    }
    public static void main(String[] args) {
//[[1,3],[3,0,1],[2],[0]]
        List<List<Integer>> rooms = List.of(
                List.of(1,3),
                List.of(3,0,1),
                List.of(2),
                List.of(0)
        );
        if(canVisitAllRooms(rooms)){
            System.out.println("We have visited all rooms!!");
        }else {
            System.out.println("We have not visited all rooms!!");
        }

    }
}

