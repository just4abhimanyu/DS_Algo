package com.av.ds.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {

    private static void getStringsGroupByLength(String[] strings){

        Map<Integer, List<String>> stringFrequency = new HashMap<>();

        for (String string : strings) {
            int length = string.length();
            if (stringFrequency.containsKey(length)) {
                List<String> stringList = stringFrequency.get(length);
                stringList.add(string);
                stringFrequency.put(length, stringList);
            }else {
                stringFrequency.put(length,new ArrayList<>(List.of(string)));
            }

        }
        System.out.println(stringFrequency);
    }
    public static void main(String[] args) {
    String[] strArr = {"cat","mat","mango","dogyy","ab"};
    getStringsGroupByLength(strArr);
    System.out.println("---------------------------------");
    getStringsGroupByLengthByStream(strArr);
    }

    private static void getStringsGroupByLengthByStream(String[] strings){
        Map<Integer, List<String>> stringFrequency = Arrays.stream(strings).collect(Collectors.groupingBy(String::length));
    System.out.println(stringFrequency);

    }
}
