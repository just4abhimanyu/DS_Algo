package com.av.ds.general;

import java.util.*;

public class TwoSum {
    private static int[] getTwoSum(int[] arr , int target){
        Map<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int secondNum = target - arr[i];
            if (map.containsKey(secondNum)){
                System.out.println("==========================================");
                return new int[]{map.get(secondNum) , i};
            }
            map.put(arr[i] , i);
        }

        throw new IllegalArgumentException("Number Not found");
    }

    public static void main(String[] args) {

        int[] numbs = {1,2, 7,8, 11, 15};
        System.out.println(Arrays.toString(numbs));
        int target = 9;
        int[] result = getTwoSum(numbs, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        List<int[]> result2 = getAllPairOfTwoSum(numbs, target);
        for (int[] arr : result2){
            System.out.println("1st Index = "+arr[0]+"-->"+numbs[arr[0]]+"::2nd Index = "+arr[1]+"--->"+numbs[arr[1]]+"====Target:"+target);
        }
    }
    private static List<int[]> getAllPairOfTwoSum(int[] arr , int target){
        Map<Integer,Integer> collect = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int secondEle = target - arr[i];
            if (collect.containsKey(secondEle)){
                result.add(new int[]{collect.get(secondEle), i});
            }
            collect.put(arr[i] , i);
        }
        System.out.println("==========================================");
        return result;
    }
}
