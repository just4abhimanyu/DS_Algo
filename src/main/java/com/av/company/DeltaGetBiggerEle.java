package com.av.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeltaGetBiggerEle {
private static void getGroupOfElements(int[] arr , int diff){
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    List<List<Integer>> groups = new ArrayList<>();
    int len = arr.length;
    boolean[] isVisited = new boolean[len];
    for (int i = 0; i < len ; i++){
        if (isVisited[i]){
            continue;
        }
        int data = arr[i];
        List<Integer> group = new ArrayList<>();
        group.add(data);
        int nextEle = data + diff;
        for (int j = i + 1; j < len; j++) {
            int nextData = arr[j];
            if (!isVisited[j] && nextData >= nextEle){
                group.add(nextData);
                isVisited[i] = true;
                isVisited[j] = true;
                nextEle = nextData + diff;
            }
        }
        if(group.size() > 1){
            groups.add(group);
        }
    }
    System.out.println(groups);
}

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,1,12};
        int ele = 4;
        getGroupOfElements(arr , ele);
    }
}
