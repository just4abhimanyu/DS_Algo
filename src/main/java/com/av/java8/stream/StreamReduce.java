package com.av.java8.stream;

import java.util.Arrays;
import java.util.Optional;

public class StreamReduce {

    private static void getSumOfArrayElement(int[] arr){

        Optional<Integer> optionalSum = Arrays.stream(arr).boxed()
                .reduce((a, b) -> (a+b)); //Reduces the elements of the stream to a single value using the provided binary operator.
                //We call the reduce method with a lambda expression (a, b) -> a + b as the accumulator. This lambda expression takes two integers a and b and returns their sum.
        int sum = optionalSum.get().intValue();
        System.out.println("Sum Of Array is "+sum);
    }

    private static void getUniqueNumber(int[] arr){
        Arrays.stream(arr).distinct().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,3};
        //getSumOfArrayElement(arr);
        getUniqueNumber(arr);
    }
}
