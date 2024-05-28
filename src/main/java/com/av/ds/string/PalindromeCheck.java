package com.av.ds.string;

public class PalindromeCheck {
    private static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while(left < right){

            while (left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    private static boolean isPalindromeByStringBuilder(String str){

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb + " : "+sb.reverse());
        return  sb.toString().contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        String testStr1 = "A man, a plan, a canal, Panama";
        String testStr2 = "Hello, World!";

        System.out.println("\"" + testStr1 + "\" is a palindrome: " + isPalindromeByStringBuilder(testStr1));
        System.out.println("\"" + testStr2 + "\" is a palindrome: " + isPalindromeByStringBuilder(testStr2));
        System.out.println("---------------------------------------------------------------");
        System.out.println("\"" + testStr1 + "\" is a palindrome: " + isPalindrome(testStr1));
        System.out.println("\"" + testStr2 + "\" is a palindrome: " + isPalindrome(testStr2));

    }
}
