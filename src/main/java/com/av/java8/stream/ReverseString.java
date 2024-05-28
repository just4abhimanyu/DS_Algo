package com.av.java8.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    private static void reverseString(String str){

        String resString = Stream.of(str).map(String -> new StringBuffer(str).reverse()).collect(Collectors.joining());
        System.out.println("Reversed String =>"+resString);

        String reverse2 = str.chars().mapToObj(c -> (char)c).reduce("",(s , c)->c+s,(s1,s2)->s2+s1);
        System.out.println("Reversed 2: "+reverse2);

        String reverse3 = IntStream.range(0 , str.length()).mapToObj(index -> str.charAt(str.length() -index -1)).map(Object::toString).collect(Collectors.joining());
        System.out.println("Reverse 3 :"+reverse3);

        Object[] reversedArray = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(Character::valueOf)
                .toArray();
        String reversed = Arrays.toString(reversedArray);
        System.out.println("Reversed 4 string: " + reversed);



    }
    public static void main(String[] args) {
        String str = "abhi";
        System.out.println("Actual String :"+str);
        reverseString(str);
    }
}
