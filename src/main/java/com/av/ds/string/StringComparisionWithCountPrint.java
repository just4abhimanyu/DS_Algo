package com.av.ds.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringComparisionWithCountPrint {

    public static int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) +1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println("Map="+map);
        StringBuilder res = new StringBuilder();
        int index = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("=="+(entry.getValue() == 1 ? "" : entry.getValue())+" "+entry.getKey());
            chars[index++] = entry.getKey();
            if(!(entry.getValue() == 1)){
                if(entry.getValue().toString().length() > 1){
                    char[] spCharArr = entry.getValue().toString().toCharArray();
                    chars[index++] = spCharArr[0];
                    chars[index++] = spCharArr[1];
                }else{
                    chars[index++] = (char) (entry.getValue() + '0');
                }
            }
            res.append(entry.getKey()).append(entry.getValue() == 1 ? "" : entry.getValue());
        }
        System.out.println("res="+res);
        return res.length();
    }

    public static void main(String[] args) {
        char[] charArr = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int resInt = compress(charArr);
        System.out.println(Arrays.toString(charArr));
        System.out.println("Res="+resInt);
    }
}
