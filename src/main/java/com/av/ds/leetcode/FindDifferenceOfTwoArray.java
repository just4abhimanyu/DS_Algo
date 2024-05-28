package com.av.ds.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArray {

        public static List<List<Integer>> findDifferenceBestWay(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();                           // create 2 hashsets
            Set<Integer> set2 = new HashSet<>();
            for(int num : nums1){ set1.add(num); }                         // add nums1 elements to set1
            for(int num : nums2){ set2.add(num); }                         // add nums2 elements to set2

            List<List<Integer>> resultList = new ArrayList<>();             // Initialize result list with 2 empty sublists that we will return
            resultList.add(new ArrayList<>());
            resultList.add(new ArrayList<>());

            for(int num : set1){                                            // just iterate to all elements of set1
                if(!set2.contains(num)){ resultList.get(0).add(num); }      // add those elements to first sublist of result list, which are not in set2.
            }
            for(int num : set2){                                            // just iterate to all elements of set2
                if(!set1.contains(num)){ resultList.get(1).add(num); }      // add those elements to first sublist of result list, which are not in set1
            }
            return resultList;
        }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listOFList = new ArrayList<>();
        List<Integer> num1UnMatchEle = findUniqueNumber(nums1 , nums2);
        List<Integer> num2UnMatchEle = findUniqueNumber(nums2 , nums1);

        listOFList.add(num2UnMatchEle);
        listOFList.add(num1UnMatchEle);

        return listOFList;
    }
    private static List<Integer> findUniqueNumber(int[] nums1, int[] nums2){
        Set<Integer> unMatchElement = new HashSet<>();
        for (int i = 0; i <nums2.length; i++) {
            boolean flag = false;

            for (int j = 0; j < nums1.length; j++) {
                if(nums1[j] == nums2[i]){
                    flag = true;
                }
            }
            if (!flag){
                unMatchElement.add(nums2[i]);
            }
        }
        return unMatchElement.stream().toList();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        List<List<Integer>> res1 = findDifference(nums1,nums2);
        List<List<Integer>> res2 = findDifferenceBestWay(nums1,nums2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
