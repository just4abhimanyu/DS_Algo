package com.av.ds.string;

public class ReverseVowels {

    private static String reverseVowels(String str){
        int left = 0, right = str.length()-1;
        char[] chrArr = str.toCharArray();
        while (right > left){

            if(isCharIsVowel(str.charAt(left)) && isCharIsVowel(str.charAt(right))){
                char tmp = chrArr[left];
                chrArr[left] = chrArr[right];
                chrArr[right] = tmp;
                left++;
                right--;
            }else if(!isCharIsVowel(str.charAt(left))){
                left++;
            }else if(!isCharIsVowel(str.charAt(right))){
                right--;
            }
        }
        return convertCharArrToString(chrArr);
    }
    private static String convertCharArrToString(char[] charArr){
        StringBuilder res = new StringBuilder();
        for (char ch : charArr){
            res.append(ch);
        }
        return res.toString();
    }
    private static boolean isCharIsVowel(char ch){
        if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "sdaciko";
        System.out.println("Orig :"+str);
        String res = reverseVowels(str);
        System.out.println("Resl:"+res);
    }
}
