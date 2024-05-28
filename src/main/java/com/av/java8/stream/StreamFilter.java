package com.av.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    private static void filterEvenAndOddNumber(int[] intArr){

        List<Integer> evenlist = Arrays.stream(intArr)//to create a stream of primitive integers.
                .filter(f->f%2 == 0)
                .boxed()//to convert the stream of primitive integers to a stream of boxed Integer objects.
                .collect(Collectors.toList()); // we collect the boxed integers into a List<Integer>
        System.out.println("Even List : "+evenlist);

        List<Integer> oddList = Arrays.stream(intArr).filter(f -> f%2 != 0).boxed().collect(Collectors.toList());
        System.out.println("Odd List : "+oddList);
    }
    private static void filterNumberAndCount(int[] intArr){

        Map<Integer,Long> elementWithCount = Arrays.stream(intArr).boxed()
                .collect(
                        Collectors.groupingBy( //to group the integers by their values
                                i -> i, // Classifier function to group by integer
                                Collectors.counting() // Downstream collector to count occurrences
                        )
                );
        System.out.println("Element with Count:"+elementWithCount);
    }

    private static void getCharFromString(String str){
         str.chars().mapToObj(c -> (char) c).filter(Character::isLetter).forEach(System.out :: println);
         String resStr = str.chars() // converting string to stream of character
                 .mapToObj(c->(char)c) // map each Character into Character Object
                 .filter(f->Character.isLetter(f)) // Filter only letters
                 .filter(f->Character.isUpperCase(f)) // filter only upper case letter
                 .map(Objects :: toString) // The map method applies the provided function to each element of the stream and produces a new stream containing the transformed elements.
                 .collect(Collectors.joining()); //You can collect the characters back into a String using Collectors.joining()

         System.out.println("Result String="+resStr);

    }
    private static void checkAnagramOfString(String str1,String str2){

        if(str1.length() != str2.length()){
            System.out.println("Given String are not equal length so not anagram.......");
            return;
        }

        String resultString1 = str1.chars()
                .sorted()
                .mapToObj(c-> Character.isUpperCase(c) ? Character.toLowerCase(c) : (char)c)
             //   .map(Objects :: toString)
                .collect(StringBuilder::new, StringBuilder:: appendCodePoint,StringBuilder::append)
                .toString();

        String resultStr2 = str2.chars().sorted()
                .mapToObj(c->Character.isUpperCase(c) ? Character.toLowerCase(c):(char)c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();

        if (resultStr2.equalsIgnoreCase(resultString1)){
            System.out.println("String "+str1+" and String "+str2+" are Anagram of each other");
        }else {
            System.out.println("Given String are not anagram.......");
        }


    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = "abc";
        String str1 = "cAb";
       // filterEvenAndOddNumber(numbers);,
        //filterNumberAndCount(numbers);
       // getCharFromString(str);
        checkAnagramOfString(str,str1);
    }
}
