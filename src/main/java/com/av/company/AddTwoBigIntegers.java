package com.av.company;

public class AddTwoBigIntegers {

    private static void addNumber(String str1 , String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        StringBuilder sum = new StringBuilder();
        int temp = 0;
        for(int i = 0 ;  i < len1 ; i++){
            int charSum = Integer.parseInt(String.valueOf(str1.charAt(len1 - i -1))) + Integer.parseInt(String.valueOf(str2.charAt(len2 - i - 1)));
            //System.out.println("charSum :"+charSum);
            charSum = temp != 0 ? charSum + temp : charSum;
            temp = 0;
            if(charSum > 10){
                sum.append(charSum % 10);
                temp = charSum/10;
            }else {
                sum.append(charSum);
            }
        }
        System.out.println("Sum:"+sum.reverse());
        String finalString = len1 > len2 ? str1.substring(0 ,len1 - len2 -1) + sum :  str2.substring(0 , len2 -len1 -1) + sum;
        System.out.println("Result :"+finalString);
    }
    public static void main(String[] args) {
        String str1 = "12346";
        String str2 = "12367899";
        addNumber(str1,str2);

    }

}
