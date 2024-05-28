package com.av.ds.graph;


import java.util.ArrayList;
import java.util.List;

public class MaximumLevelSumOfBinaryTree {

    public int maxLevelSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        System.out.println(list);

        int maxLevel = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(maxLevel) < list.get(i)) {
                maxLevel = i;
            }
        }
        return maxLevel + 1;
        //return 1 + IntStream.range(0, list.size()).reduce(0, (a, b) -> list.get(a) < list.get(b) ? b : a);
    }
    private void dfs(TreeNode root, List<Integer> nodeSum, int level) {
        if (root == null) { return; }

        if (nodeSum.size() == level) {
            nodeSum.add(root.val);
        } // never reach this level before, add first value.
        else {
            nodeSum.set(level, nodeSum.get(level) + root.val);
        } // reached the level before, accumulate current value to old value.
        dfs(root.left, nodeSum, level + 1);
        dfs(root.right, nodeSum, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(7);

        MaximumLevelSumOfBinaryTree solution = new MaximumLevelSumOfBinaryTree();
        int result = solution.maxLevelSum(root);
        System.out.println("Maximum level sum is: " + result);
    }
}
