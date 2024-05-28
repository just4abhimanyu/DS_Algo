package com.av.java8.lamda;

import java.util.List;

public class PrintStrListByLambdaExpression {

    public static void main(String[] args) {

        PrintFunctionalInterface functionalInterface = (list) -> list.forEach(System.out ::println);

        List<String> strList = List.of("abc","dec");
        functionalInterface.print(strList);
    }
}
