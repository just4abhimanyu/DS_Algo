package com.av.ds.string;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {
    public static boolean isSubsequence_BestWay(String s, String t) {

        if(t.length() < s.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        int i = 0;
        int j = 0;
        int lengthS = s.length();
        int lengthT = t.length();

        while (i < lengthS && j < lengthT) {
            if(arrayS[i] == arrayT[j]) {
                i++;
            }
            j++;
        }

        return i == lengthS;
    }
    public static boolean isSubsequence(String s, String t) {
        String smallString = (s.length() > t.length()) ? t : s;
        String bigString = (s.length() > t.length()) ? s : t;

        List<Integer> resIndexList = new ArrayList<>();
        for (int i = 0; i < smallString.length(); i++) {
            for (int j = 0; j < bigString.length(); j++) {
                if (smallString.charAt(i) == bigString.charAt(j)){
                    resIndexList.add(j);
                }
            }
        }
        if(smallString.length() != resIndexList.size()){
            return false;
        }else {
            for (int i = 1; i < resIndexList.size(); i++) {
                if (!(resIndexList.get(i) > resIndexList.get(i - 1))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";
        boolean b = isSubsequence(s,t);
        if (b){
            System.out.println("String "+s+" is Substring of String "+t);
        }else {
            System.out.println("String "+s+" is not Substring of String "+t);
        }
    }
}
