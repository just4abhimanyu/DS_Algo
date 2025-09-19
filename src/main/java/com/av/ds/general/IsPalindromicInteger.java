package com.av.ds.general;

public class IsPalindromicInteger {

    private static boolean isPalindromicInteger(int num) {

        if(num < 0 || (num%10 == 0 && num != 0)){
            return false;
        }

        int reversedNumber = 0;
        int temp = num;
        while (temp > 0) {

            reversedNumber = reversedNumber*10 + temp%10;
            temp = temp/10;

        }
        System.out.println("Reversed number :"+reversedNumber + ": number = " + num);

        return num == reversedNumber;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindromicInteger(num));
        System.out.println("------------------------------");
        System.out.println(isPalindromicIntegerBestWay(121));
    }
    private static boolean isPalindromicIntegerBestWay(int num) {
// negative number cant be Palindrom
        if (num < 0 || (num%10 == 0 && num != 0)) {
            return false;
        }
        int reversedNumber = 0;
        while(num > reversedNumber){
            reversedNumber = reversedNumber*10 + num%10; // adding number from last
            num = num/10; // extracting remaining number except last one
        }
        System.out.println("Reversed number :"+reversedNumber + ": number = " + num);

        return num == reversedNumber || num == reversedNumber/10;
        // reversed number will not have first integer of num
        // for getting last number from self and comparing with remaining value of num

    }


}
