package com.av.ds.general;

public class BasicCalculator {

    private static double calculate(double data1 , double data2 , char operator){

        switch (operator) {
            case '+':
                return data1 + data2;
            case '-':
                return data1 - data2;
            case '*':
                return data1*data2;
            case '%':
                return data1%data2;
            case '/':
                if (data2!=0){
                    return data1/data2;
                }else {
                    throw new IllegalArgumentException("Division By Zero!");
                }
            default:
                throw new IllegalArgumentException("invalid operator!");
        }
    }

    public static void main(String[] args) {
        double data1 = 3;
        double data2 = 1;
        char opr = '/';
        double result = calculate(data1,data2,opr);
        System.out.println(data1+""+opr+data2+" = "+result);
    }
}
