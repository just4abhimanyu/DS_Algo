package com.av.company;

public class CharWithCount {

    private static void printCharWithCount(String str){
        String resStr = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt( i -1)){
                count++;
            }else {
                resStr += count + "" + str.charAt( i -1);
                count = 1;
            }
        }
        resStr += count + "" + str.charAt(str.length() -1);

        System.out.println("Final String :"+resStr);
    }

    public static void main(String[] args) {
        String str = "AAABBBBCCA";
        printCharWithCount(str);
    }
}
