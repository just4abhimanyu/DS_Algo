package com.av.ds.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for (int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else {
                map.put(num , 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static int singleNumberBySorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i +=2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }
    public static Optional<Integer> singleNumberByStreamAPI(int[] nums) {

        Map<Integer, Long> arraysCount = Arrays.stream(nums).sorted().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(arraysCount);
        return  arraysCount.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().map(Map.Entry::getKey);
    }
    public static int singleNumberByXOR(int[] nums) {
        int uniq = 0;
        for(int num : nums){
            uniq = uniq ^ num;
        }
        return uniq;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1, 4};
        int uniqueNumber = singleNumberByStreamAPI(array).get();
        System.out.println("Unique Number is "+uniqueNumber);
        int uniqueBYXor = singleNumberByXOR(array);
        System.out.println("Unique Number by XOR is "+uniqueBYXor);
    }
}
