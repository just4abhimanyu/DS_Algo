package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatch {
//You can use noneMatch to ensure that none of the elements in the stream satisfy a specific condition.
    private static void isThereAnyMatch(List<Integer> numbers){

        boolean noneGreaterThanTen = numbers.stream().noneMatch(num -> num > 10);
        System.out.println("Is greater than 10 "+noneGreaterThanTen);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        isThereAnyMatch(numbers);
    }
}
