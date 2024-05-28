package com.av.java8.stream;

import java.util.stream.Stream;

public class StreamLimit {

    private static void getLimit(){
        // Create a stream of integers from 1 to 10
        Stream<Integer> numbersStream = Stream.iterate(1, n -> n + 1) //We create an infinite stream of integers starting from 1 using
                .limit(10); //method to limit the size of the stream to 10 elements, effectively truncating the infinite stream.

        // Print the first 5 elements of the stream
        numbersStream.limit(5) // We then call limit(5) on the resulting stream to further limit it to the first 5 elements.
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        getLimit();
    }
}
