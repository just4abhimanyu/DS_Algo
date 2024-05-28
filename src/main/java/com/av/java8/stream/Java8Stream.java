package com.av.java8.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Stream {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i =0 ; i < array.length ; i++){
            sum += array[i];
        }
        System.out.println("Sum:"+sum);
        IntStream strm = Arrays.stream(array);
        //int sum = strm.sum();
        System.out.println(Arrays.stream(array).sum());

        System.out.println(Arrays.stream(array).reduce(0,(a,b) -> (a+b)));
        System.out.println(Arrays.stream(array).reduce(0,Integer::sum));
        System.out.println("Box:"+Arrays.stream(array).boxed().collect(Collectors.toList()).stream().mapToInt(a->a).sum());


    }
}
