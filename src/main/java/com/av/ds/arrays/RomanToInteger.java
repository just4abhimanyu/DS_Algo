package com.av.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static void main(String[] args) {
    String romanString = "MCMXCIV";
        int romanToInteger = romanToInt(romanString);
        System.out.println(romanToInteger);
        System.out.println("--------------------------");
        int romanToInteger2 = romanToInt_BestWay(romanString);
        System.out.println(romanToInteger2);
    }
    private static void addKeyValuePair(Map<Character, Integer> map){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        addKeyValuePair(map);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
    private static int valueOf(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    private static int romanToInt_BestWay(String romanString) {
        int result = 0;
        int prev = 0; // Initializes a variable prev to store the integer value of the previous Roman numeral character during iteration.

        for (int i = 0; i < romanString.length(); i++) { // Starts a loop to process each character of the input Roman numeral string from left to right.

            int number = valueOf(romanString.charAt(i));
            if ( number > prev ) {
                result += number;
            }else{
                result -= number;
            }
            prev = number;
        }
return  result;
    }
}
