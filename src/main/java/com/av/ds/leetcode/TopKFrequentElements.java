package com.av.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an integer array nums and an integer k, return the k most frequent elements.
 You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]
 */
public class TopKFrequentElements {

    private List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new ArrayList[nums.length + 1]; // creating bucket to store data with count

        Map<Integer, Integer> frequency = new HashMap<>(); // storing element with count
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        System.out.println(frequency);

        // Update bucket(count as bucket index) with element
        for(int key : frequency.keySet()){
            int freq = frequency.get(key);

            if(bucket[freq] == null){  // add arraylist on that bucket
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length -1; i >= 0 && k > 0; i--) {

            if(bucket[i] != null){// ignoring the buket index if empty

                for(Integer element : bucket[i]) {

                    result.add(element);
                    k--;

                }
            }

        }

        return result;
    }
// TC : O(n)
// SC : O(n)
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        List<Integer> topFrequentElements = topKFrequentElements.topKFrequent(arr, k);
        System.out.println("Top frequent element is : " + topFrequentElements);

    }
}
