package com.av.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumberWithoutUsingCollection {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] result = findUniqueNumbers(arr);

        System.out.println("Unique numbers in the array are:"+ Arrays.toString(result));
    }

    private static int[] findUniqueNumbers(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num] = count[num] + 1;
        }

        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int j = 0; j < count.length; j++) {
            if (count[j] == 1) {
                uniqueNumbers.add(j);
            }
        }
        return uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
