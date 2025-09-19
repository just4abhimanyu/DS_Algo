package com.av.ds.string;

import java.util.ArrayList;
import java.util.List;

public class IntegerSumFromString {

    private static int getIntegerSum(String str){

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='-' || Character.isDigit(str.charAt(i))){
               StringBuilder sb = new StringBuilder();
                if(str.charAt(i)=='-' && Character.isDigit(str.charAt(i+1))){

                    do {
                        sb.append(str.charAt(i));
                        i++;
                    } while (i < str.length() && Character.isDigit(str.charAt(i)));
                }else if(Character.isDigit(str.charAt(i))){
                    do {
                        sb.append(str.charAt(i));
                        i++;
                    } while (i < str.length() && Character.isDigit(str.charAt(i)) );
                }
                list.add(Integer.parseInt(sb.toString()));
            }
        }
        for(int data : list){
            sum += data;
        }
        return sum;

    }
    public static void main(String[] args) {
    String s = "scdc23kld-43kd3";
    int sumOfInteger = getIntegerSum(s);
    System.out.println(sumOfInteger);
    }
}
