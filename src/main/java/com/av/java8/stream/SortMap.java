package com.av.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    private static void sortMapByKey(Map<String , Integer> unsortedMap){

        Map<String, Integer> defaultSorting = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                         (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted by key");
        defaultSorting.forEach((key , value) -> System.out.println(key+"-->"+value));
        System.out.println("------------------------");
        Map<String, Integer> customSortedOrder = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (oldVal , neyVal) -> oldVal,
                        LinkedHashMap :: new
                ));
        customSortedOrder.forEach((a,b) -> System.out.println(a+" -> "+b));

    }


    public static void main(String[] args) {
        sortMapByKey(getMap());
        sortMapByValue(getMap());
        sortByTreeMap(getMap());
    }


    private static void sortMapByValue(Map<String , Integer> unsortedMap) {
        Map<String , Integer> defaultSorting= unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey ,
                        Map.Entry::getValue,
                        (oldVal , newVal)-> oldVal,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by value");
        defaultSorting.forEach((key , value) -> System.out.println(key+" --> "+value));
        System.out.println("-------------------------");

        Map<String , Integer> customSort = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal , newVal) -> oldVal,
                        LinkedHashMap :: new
                ));
        customSort.forEach((a,b) -> System.out.println(a+" -> "+b));
    }


    private static void sortByTreeMap(Map<String, Integer> unSortedMap){
        TreeMap<String , Integer> sortedMap = new TreeMap<>(unSortedMap);
        System.out.println("\nDefault sorting by TreeMap will do by key");
        sortedMap.forEach((a,b) -> System.out.println(a+" -> "+b));
        System.out.println("----------Custom sort by value------------------");

        Comparator<String> sortByValue = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare = unSortedMap.get(o1).compareTo(unSortedMap.get(o2));
                return compare == 0 ? 1 : compare;
            }
        };

        Map<String,Integer> customSort = new TreeMap<>(sortByValue);
        customSort.putAll(unSortedMap);
        customSort.forEach((a,b) -> System.out.println(a+" -> "+b));
    }
    private static Map<String, Integer> getMap(){
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("cherry", 50);
        originalMap.put("apple", 10);
        originalMap.put("date", 40);
        originalMap.put("banana", 30);
        return originalMap;
    }
}
