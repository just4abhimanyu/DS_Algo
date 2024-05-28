package com.av.ds.string;

public class StringPalindrome {
    private static char convertToLowerCase(char ch){
        if(ch >= 65 && ch <= 90){
            return ch = (char) (ch + 32);
        }
        return ch;
    }
    private static boolean isStringPalindrome(String str){

        if(str.length() == 1){
            return true;
        }
        int i = 0, j = str.length() -1;
        while (i < j){
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(j);

            if (leftChar != rightChar){
                leftChar = convertToLowerCase(leftChar);
                rightChar = convertToLowerCase(rightChar);

                if(leftChar != rightChar)
                    return false;
            }
            i++;j--;
        }
        return true;
    }
    private static boolean isStringIsPalindromeByRecursion(String str){
        //System.out.println("str="+str);
        if (str.isEmpty() | str.length() == 1){
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length()-1)){
            if(convertToLowerCase(str.charAt(0)) != convertToLowerCase(str.charAt(str.length()-1))){
                return false;
            }

        }
        return isStringIsPalindromeByRecursion(str.substring(1,str.length()-1));
    }
    public static void main(String[] args) {
        String str = "MaDAm";
            if(isStringIsPalindromeByRecursion(str)){
                System.out.println("String is palindrome......");
            }else {
                System.out.println("String is not palindrome......");
            }
    }
}
