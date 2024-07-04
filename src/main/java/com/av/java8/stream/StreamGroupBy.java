package com.av.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

    private static void getDataGroupBy(List<Person> people){

        // Grouping people by their ages
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Printing the result
        peopleByAge.forEach((age, group) -> {
           System.out.println("Age: " + age);
            group.forEach(System.out::println);
            System.out.println("----------------------");
        });
    }
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("Dave", 25)
        );
        getDataGroupBy(people);
        System.out.println("people= "+people);
    }
}
