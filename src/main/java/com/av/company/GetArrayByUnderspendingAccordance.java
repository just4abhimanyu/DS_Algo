package com.av.company;
import java.util.*;
import java.util.stream.Collectors;

public class GetArrayByUnderspendingAccordance {


    private static void getArrayByCountAccordingOrder(int[] arr){

        Map<Integer, Integer> countPair = new HashMap<>();
        for(int data : arr){
            countPair.put(data,countPair.getOrDefault(data ,0) + 1);
            //Integer i = countPair.containsKey(data) ? countPair.put(data, countPair.get(data) + 1) : countPair.put(data, 1);
           // System.out.println("i="+i);
        }
        System.out.println("Counts:"+countPair);

        List<Integer> sortedCounts = countPair.values().stream().sorted((a,b)->(b-a)).toList();
        System.out.println("Sorted Value:"+sortedCounts);
        int[] resArr = new int[arr.length];
        Map<Integer, Integer> newMap = new HashMap<>(countPair);
        int index = 0;
        for (int count:sortedCounts){
            int element = getKeyByValue(newMap , count);
            for (int i = 0; i < count; i++) {
                resArr[index++] = element;
            }
        }
        System.out.println("Final Arr:"+ Arrays.toString(resArr));
    }
    private static int getKeyByValue(Map<Integer, Integer> countPair,int value){
        for(Map.Entry<Integer,Integer> entry : countPair.entrySet()){
            if (entry.getValue().equals(value)){
                int key = entry.getKey();
                countPair.remove(key,value);
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,5,6,5,8,6,8,3};
        System.out.println("Original Arr:"+ Arrays.toString(arr));
       // getArrayByCountAccordingOrder(arr);
        arrangeElementByCountDescInStream(arr);
    }
    private static void arrangeElementByCountDescInStream(int[] arr) {
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("frequencyMap=" + frequencyMap);

        List<Integer> sortListed = Arrays.stream(arr).boxed()
                .sorted((a, b) -> {
                    int frequency = frequencyMap.get(b).compareTo(frequencyMap.get(a));
                    System.out.println("a="+a+":b="+b+":frequency="+frequency);
                    if (frequency == 0) {
                        return Integer.compare(a, b);
                    }
                    return frequency;
                }).toList();
        int[] sortedArr = sortListed.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Sorted Array : "+ Arrays.toString(sortedArr));
    }
}
