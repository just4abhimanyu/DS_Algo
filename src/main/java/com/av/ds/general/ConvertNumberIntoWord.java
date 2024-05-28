package com.av.ds.general;

public class ConvertNumberIntoWord {
    private static final String[]  LESS_THAN_TWENTY = {"","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String[] TENS = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    private static final String[] THOUSANDS = {"","hundred","Million", "Billion"};

    private static String convertNumberIntoWord(int num){
        if (num == 0){
            return "Zero";
        }
        String word = "";
        int index = 0;
        while (num > 0){
            if (num % 1000 != 0){
                word = helper(num%1000) + THOUSANDS[index] +" "+word;
            }
            num /= 1000;
            index++;
        }

        return word;
    }

    private static String helper(int num) {
        if (num == 0){
            return "";
        }else if (num < 20){
            return LESS_THAN_TWENTY[num]+ " ";
        } else if (num < 100){
            return TENS[num/10]+ " " + helper(num % 10);
        }else {
            return LESS_THAN_TWENTY[num / 100] + " hundred " +helper(num % 100);
        }
    }

    public static void main(String[] args) {
        int intVal = 123;
        String intToWord = convertNumberIntoWord(intVal);
        System.out.println(intVal+" to word :"+intToWord);
    }
}
