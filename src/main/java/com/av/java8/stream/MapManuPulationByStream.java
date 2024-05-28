package com.av.java8.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapManuPulationByStream {

    private static void getMaxvalueFromKeyMapEntrySet(Map<Integer , Integer> map){
       // map.entrySet().stream().max(Integer::compareTo).get();
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
    }

    public static void main(String[] args) {
        Map<Integer , Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,8);
        map.put(3,0);
        map.put(4,3);
        getMaxvalueFromKeyMapEntrySet(map);
    }
}
