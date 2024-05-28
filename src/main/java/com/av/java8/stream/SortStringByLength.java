package com.av.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {
    private static void sortStringBasedOnLength(String[] strList){

        List<String> resList1 = Arrays.stream(strList).sorted((s1,s2) -> Integer.compare(s1.length(),s2.length())).toList();
        System.out.println("Sorted List \n"+resList1);
        List<String> resList2 = Arrays.stream(strList).sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Sorted List \n"+resList2);
    }
    public static void main(String[] args) {
        String[] strList = {"abc","defr","dghij","ab","aaaba"};
        sortStringBasedOnLength(strList);
    }
}
