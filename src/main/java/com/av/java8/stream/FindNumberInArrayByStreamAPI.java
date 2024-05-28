package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNumberInArrayByStreamAPI {
    public static void findEvenNumberIndexFromArray(int[] arr){
        List<Integer> resultList = IntStream.range(0,arr.length).filter(number -> arr[number] % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println("even Num Index list:"+resultList);
    }
    public static void findOddNumberFromArray(int[] arr){
       List<Integer> oddList = IntStream.range(0,arr.length).filter(index -> arr[index] % 2 != 0).boxed().toList();
        System.out.println("Odd List:"+oddList);
    }
    public static void printOddNumber(int[] arr){
        IntStream.range(0,arr.length).filter(index -> arr[index] % 2 ==0).forEach(i->System.out.println("Index:"+i+" value:"+arr[i]));
    }
    
    public static void getNumberOfCharacter(String str){

        Map<Integer,Long> map = str.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((character, count) -> System.out.println(character + ": " + count));
        Map<Integer,Long> map1 = str.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map1.forEach((Ch,c)->System.out.println("Char :"+Ch+" count:"+c));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        findEvenNumberIndexFromArray(arr);
        findOddNumberFromArray(arr);
        printOddNumber(arr);
        getNumberOfCharacter("abha");
    }
}
