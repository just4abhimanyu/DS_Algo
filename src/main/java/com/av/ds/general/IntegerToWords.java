package com.av.ds.general;
public class IntegerToWords {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        if (num < 0) {
            return "Minus " + convertToWords(-num);
        }

        String words = "";

        if ((num / 1000000) > 0) {
            words += convertToWords(num / 1000000) + " Million ";
            num %= 1000000;
        }

        if ((num / 1000) > 0) {
            words += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if ((num / 100) > 0) {
            words += convertToWords(num / 100) + " Hundred ";
            num %= 100;
        }

        if (num > 0) {
            if (num < 10) {
                words += units[num];
            } else if (num < 20) {
                words += teens[num - 10];
            } else {
                words += tens[num / 10] + " " + units[num % 10];
            }
        }

        return words;
    }

    public static void main(String[] args) {
        int number = 1234567;
        System.out.println(number + " in words: " + convertToWords(number));
    }
}
