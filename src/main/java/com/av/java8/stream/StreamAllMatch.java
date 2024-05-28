package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatch {

    private static void isAllMatched(List<Integer> list){

        boolean allEven = list.stream().allMatch(num -> num % 2 == 0);
        System.out.println("Is all matched "+allEven);
        boolean allDigits = "1234556".chars().allMatch(Character::isDigit);
        System.out.println("Is all Digit "+allDigits);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        isAllMatched(numbers);
    }
}
