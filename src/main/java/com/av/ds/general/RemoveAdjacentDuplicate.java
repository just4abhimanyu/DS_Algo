package com.av.ds.general;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Remove adjacent duplicate char from string
 * abbcacccdaaax ---> abcacdax
 */
public class RemoveAdjacentDuplicate {

    private static String removeAdjacentDuplicateCharByStack(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){

            if(stack.isEmpty() || !(stack.peek() == c)){

                stack.push(c);
            }

        }
        return stack.stream().map(String :: valueOf) // convert char -> String
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "abbcacccdaaax";
        System.out.println("Main  : "+str);

        String result = removeAdjacentDuplicateCharByStack(str);
        System.out.println("Result  : "+result);

        String result1 = removeAdjacentDuplicateChar(str);
        System.out.println("Result  : "+result1);
    }


    private static String removeAdjacentDuplicateChar(String str){

        int len = str.length();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < len; i++) {

            if(str.charAt(i - 1) != str.charAt(i)){
                result.append(str.charAt(i - 1));
            }
        }
        result.append(str.charAt(len - 1));

        return result.toString();
    }

}
