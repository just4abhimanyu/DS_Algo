package com.av.ds.string;

public class ReverseString {

    private static String reverseStringByRecursion(String str,String rev){
        if(str.length() ==1 && rev.isEmpty()){
            return str;
        }
        if(str.isEmpty() && !rev.isEmpty()){
            return rev;
        }
        return reverseStringByRecursion(str.substring(0,str.length()-1),rev +str.charAt(str.length()-1));

    }

    public static void main(String[] args) {
       String rev = reverseStringByRecursion("abcdefghi","");
       System.out.println("Rev:"+rev);
    }
}
