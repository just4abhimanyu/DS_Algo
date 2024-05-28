package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatch {

    private static void checkStreamContainsAnElement(List<Integer> numbers){
       boolean isMatched = numbers.stream().anyMatch(num -> num%2 ==0);
       System.out.println(isMatched);
        isMatched = numbers.stream().anyMatch(n -> n ==2);
        System.out.println("is present 2 "+isMatched);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        checkStreamContainsAnElement(numbers);

    }
}
