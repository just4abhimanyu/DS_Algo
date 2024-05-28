package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.Comparator;


public class GenerateLargestNumberFromArray {

        public static String addArrayString(int[] sortedArray){
            StringBuilder res = new StringBuilder();
            for (int resSt : sortedArray){
                res.append(resSt);
            }
            return res.toString();
        }
    public static String getLargestNumberFromArray(String[] strArr){
        //String[] strArr = new String[]{Arrays.toString(arr)};
        Arrays.sort(strArr,(num1,num2)->(num2+num1).compareTo(num1+num2));
        System.out.println("sorted Arr :"+ Arrays.toString(strArr));
        StringBuilder res = new StringBuilder();
        for (String resSt : strArr){
            res.append(resSt);
        }
        return res.toString();
    }
    public static String getLargeDigitFromArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                String fValue = String.valueOf(arr[i]);
                String sValue = String.valueOf(arr[j]);
                if(Integer.parseInt(fValue + sValue) > Integer.parseInt(sValue + fValue)){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Sorted Arr :"+Arrays.toString(arr));
        return addArrayString(arr);
    }

    public static String getLargeDigitFromArrayByCompareTo(String[] arr){
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(String.valueOf(o1) + o2) > Integer.parseInt(String.valueOf(o2) + o1) ? -1 : 0 ;
            }
        });

        System.out.println("Compa Sorted Arr :"+Arrays.toString(arr));
        return addArrayString(convertArrayOfStringTArrayOfInteger(arr));
    }
    public static int[] convertArrayOfStringTArrayOfInteger(String[] strArr){
        int[] intArr = new int[strArr.length];
        int i = 0;
        for (String arrVal : strArr){
            intArr[i] = Integer.valueOf(arrVal);
            i++;
        }
        return intArr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        String resultStr = getLargestNumberFromArray(new String[]{"3", "30", "34", "5", "9"});
        System.out.println(resultStr);
        getLargeDigitFromArray(arr);
        String compResult = getLargeDigitFromArrayByCompareTo(new String[]{"3", "30", "34", "5", "9"});
        System.out.println("Comp Res:"+compResult);
    }
}
