package com.av.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSkip {

    private static void getChunkOfData(){
        // Create a list of integers from 1 to 100
        List<Integer> numbers = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Process the data in chunks of size 10
        int pageSize = 10;
        for (int page = 0; page < numbers.size(); page += pageSize) {

            List<Integer> pageData = numbers.stream()
                    .skip(page)
                    .limit(pageSize)
                    .collect(Collectors.toList());

            // Process the chunk/page of data
            System.out.println("Processing page " + (page / pageSize + 1) + ": " + pageData);
        }

    }
    private static void skipFirst5Element(){
        // Create a stream of integers from 1 to 10
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(10);

        // Skip the first 5 elements of the stream and print the rest
        numbers.skip(5)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //skipFirst5Element();
        getChunkOfData();
    }
}
