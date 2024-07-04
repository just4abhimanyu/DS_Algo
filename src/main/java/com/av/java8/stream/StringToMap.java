package com.av.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToMap {

    private static void convertStringToMap(String str){

        Map<Integer , String> strMap = Arrays.stream(str.split(","))
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(keyVal -> Integer.parseInt(keyVal[0]) , keyVal -> keyVal[1]));

        strMap.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        String str = "1:one,2:two,3:three";
        convertStringToMap(str);
    }
}
