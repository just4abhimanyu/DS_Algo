package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    /**
     * t's particularly useful when you have a stream of collections or arrays, and you want to flatten them into a single stream of their elements.
     *
     *
     *
     */
    private static void mappingAndFlattening(){
        List<Person> personList = Arrays.asList(
                                                new Person("abhi"),
                                                new Person("manu"),
                                                new Person("abc"),
                                                new Person("def")
                                                );

        List<String> strList = personList.stream()
                                .map(Person::getName)
                                .flatMap(name -> Arrays.stream(name.split("")))
                                .toList();
        System.out.println("Char Array :"+strList);

    }
    private static void byFlatteringNestedCollection(){
        List<List<Integer>> nestedLists = Arrays.asList(
                                                        Arrays.asList(1, 2, 3),
                                                        Arrays.asList(41, 5, 6),
                                                        Arrays.asList(7, 8, 9)
                                                        );

        List<Integer> flattenedList = nestedLists.stream()
                                                .flatMap(stream -> stream.stream()) // converting list<list> into list
                                                .collect(Collectors.toList()); // collecting as list

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
    private static void useFlatMap(List<String> sentences){

        // Using flatMap to split sentences into words
        Stream<String> wordsStream = sentences.stream()
                .flatMap(
                        sentence -> Arrays.stream(sentence.split("\\s+"))
                );

        // Printing the words
        wordsStream.forEach(System.out::println);
    }
    private static void manyToOneMapping(){
        List<String> strings = Arrays.asList("hello world", "java programming", "stream api");

     List<String> flatString = strings.stream().flatMap(str -> Arrays.stream(str.split("\\s+"))).collect(Collectors.toList());
        System.out.println("String Array to word array :"+flatString);
        String resultingStr = flatString.stream().collect(Collectors.joining(" "));
        System.out.println("Combined String :"+resultingStr);
    }
    private static void withStreamOfStream(){
        Stream<Stream<Integer>> streamOfStreams = Stream.of(
                                                            Stream.of(1, 2, 3),
                                                            Stream.of(4, 5, 6),
                                                            Stream.of(7, 8,8, 9)
                                                            );

        List<Integer> flattenedStream = streamOfStreams.flatMap(Function.identity()).collect(Collectors.toList());
        System.out.println("Stream of Stream "+flattenedStream);
    }
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java is awesome", "Stream API is powerful", "FlatMap is useful");
        //useFlatMap(sentences);
        //byFlatteringNestedCollection();
       // mappingAndFlattening();
       // manyToOneMapping();
        withStreamOfStream();
    }
}
