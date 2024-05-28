package com.av.ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwapCharAndCheckStringEquality {

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())return false;
        if(s.equals(goal)){
            Set<Character> uniqueChar = new HashSet<>();
            for(char c : s.toCharArray()){
                uniqueChar.add(c);
            }
            return uniqueChar.size() < s.length();
        }

        List<Integer> diff = new ArrayList<>();
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) != goal.charAt(i)){
                diff.add(i);
            }
        }
        return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
                && goal.charAt(diff.get(0)) == s.charAt(diff.get(1));

    }
    public static void main(String[] args) {
        String s = "aaaaaaabd";
        String goal = "aaaaaaadb";
        boolean isEqual = buddyStrings(s,goal);
        System.out.println(isEqual);
    }
}
