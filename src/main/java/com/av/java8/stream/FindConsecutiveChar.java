package com.av.java8.stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindConsecutiveChar {

    private static void getConsecutiveChar(String str){

        Set<Character> consChars = new HashSet<>();
        IntStream.range(1 , str.length()).filter(i -> str.charAt(i) == str.charAt(i-1)).forEach( f -> consChars.add(str.charAt(f)));
        System.out.println("ConsecutiveChar:"+consChars);

        int[] consChar = IntStream.range(1,str.length()).filter(i -> str.charAt(i) == str.charAt(i-1)).toArray();
    }

    public static void main(String[] args) {
        getConsecutiveChar("ABCDDEFEFGGH");
    }
}
