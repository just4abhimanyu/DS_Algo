package com.av.ds.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "()[]{}";
        boolean isValid = isValidParentheses(str);
        if(isValid){
            System.out.println(str+" is valid parentheses");
        }else {
            System.out.println(str+" is not valid parentheses");
        }
    }

    private static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){

            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            } else if(ch == '}' || ch == ')' || ch == ']'){

                if (stack.isEmpty()){
                    return false;
                }
                char topEle = stack.pop();
                if(!isValidPair(topEle,ch)){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean isValidPair(char topEle, char ch) {
        return (topEle == '(' && ch == ')') ||
                (topEle == '{' && ch == '}')
                || (topEle == '[' && ch == ']');
    }
}
