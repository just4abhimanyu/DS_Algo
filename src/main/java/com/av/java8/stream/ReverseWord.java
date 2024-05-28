package com.av.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseWord {

    private static  void reverseWord(String str){
        String rev1 = Arrays.stream(str.split("\\s+")).reduce((w1,w2)-> w2 +" "+ w1).orElse("");
        System.out.println("Reversed String ->"+rev1);

        Arrays.stream(str.split("\\s+")).forEach(System.out::println);

        String[] strArr= str.split("\\s+");
        String reversedWords = IntStream.range(0 , strArr.length).mapToObj(index -> strArr[strArr.length - index - 1]).collect(Collectors.joining(" "));
        System.out.println("Reversed 2 String :"+reversedWords);



    }
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Orig str->"+str);
        reverseWord(str);
    }
}
