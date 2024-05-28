package com.av.ds.leetcode;
/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs {

    private static int getMinCostClimbingStairs(int[] cost){
        int twoStepBefore = cost[0];
        int oneStepBefore = cost[1];
        int currentCost = 0;
        for (int i = 3; i < cost.length; i++) {
            System.out.println("twoStepBefore :"+twoStepBefore+" oneStepBefore :"+oneStepBefore);
            currentCost = cost[i] + Math.min(twoStepBefore , oneStepBefore);
            twoStepBefore = oneStepBefore;
            oneStepBefore = currentCost;
        }
        return Math.min(oneStepBefore, twoStepBefore);
    }
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        int minTravelCost = getMinCostClimbingStairs(arr);
        System.out.println("Minimum Cost is :"+minTravelCost);
    }
}
