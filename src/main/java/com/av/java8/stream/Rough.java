package com.av.java8.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rough {

    public static void main(String[] args) {
        List<String> list = List.of("abc", "abc", "xyx", "mno", "asd");

        list.forEach(System.out::println);

        String result = list.stream().collect(Collectors.joining(":"));
        System.out.println("zString joining -> "+result);

        Map<String, Long> groupBy =
                list.stream()
                        .collect(
                                Collectors.groupingBy(String::valueOf, TreeMap::new, Collectors.counting())
                        );
        System.out.println("groupBy -> "+groupBy);

        Map<String,Long> groupByUpperCase = list.stream().collect(Collectors.groupingBy(String::new, LinkedHashMap::new, Collectors.counting()));
        System.out.println("groupByUpperCase -> "+groupByUpperCase);

        long count = list.stream().collect(Collectors.counting());
        System.out.println("count -> "+count);
        long countAgain = list.stream().count();
        System.out.println("count Again -> "+countAgain);

        List<Boolean> valueOf = list.stream().map(s -> s.contains("abc") ).toList();
        System.out.println("valueOf -> "+valueOf);
        List<String> mapToUpperCase = list.stream().map(String::toUpperCase).toList();
        System.out.println("mapToUpperCase -> "+mapToUpperCase);

        List<String> mapToJoin = list.stream().map(str -> String.join("->", str,str)).toList();
        System.out.println("mapToJoin -> "+mapToJoin);
        //m================================================
        List<String> list1 = List.of("abc", "  ", "x   yx", "mno    ", "      asd");
        List<String> mapToStrip = list1.stream().map( String::strip).toList(); // trip remove head and tail space
        System.out.println("mapToStrip -> "+mapToStrip);

        list1.stream().map(String :: isBlank).forEach(System.out::println);


    }
}
