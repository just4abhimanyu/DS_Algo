package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> separateEvenOddNumbers = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(separateEvenOddNumbers);

        //list.stream().collect(Collectors.groupingBy());
    }
}
