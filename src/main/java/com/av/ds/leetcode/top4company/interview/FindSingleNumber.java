package com.av.ds.leetcode.top4company.interview;

import java.util.Set;

/*
Given a non-empty array of integers nums, every element appears twice except one element. Find that single one.

Expected TC: O(n) and SC: O(1)

Example 1:
Input: nums = [2,2,1]
Output: 1
 */
public class FindSingleNumber {
    public int findSingleNumber_byBrutForce(int[] nums) { // TC : O(N) , SC : O(N)
        int singleNumber = -1;
        Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }
        for (Integer number : numSet) {
            singleNumber = number;
        }
        return singleNumber;
    }
    private int findSingleNumber_byXOR(int[] nums) { // TC : O(N) , SC : O(1)
        int singleNumber = 0;
        for (int num : nums) {
            singleNumber ^= num; // XOR operation
        }
        return singleNumber;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,1,2};
        FindSingleNumber findSingleNumber = new FindSingleNumber();
        int singleNumber =
               // findSingleNumber.findSingleNumber_byBrutForce(nums);
        findSingleNumber.findSingleNumber_byXOR(nums);
        System.out.println("Single number in array "+singleNumber);
    }
}
