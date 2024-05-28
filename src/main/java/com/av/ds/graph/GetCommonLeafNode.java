package com.av.ds.graph;

import java.util.ArrayList;
import java.util.List;
/*
Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */
public class GetCommonLeafNode {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getCommonLeaf(root1 , list1);
        getCommonLeaf(root2 , list2);
        return list1.equals(list2);
    }
    private static void getCommonLeaf(TreeNode root , List<Integer> leafNodes ){

        if (root == null) return;

        if(root.left == null & root.right == null){
            leafNodes.add(root.val);
        }

        getCommonLeaf(root.left , leafNodes);
        getCommonLeaf(root.right , leafNodes);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode tree1 = tree.createTreeByList(List.of(1,2,3));
        TreeNode tree2 = tree.createTreeByList(List.of(1,3,2));
        boolean isEqual = leafSimilar(tree1 ,tree2 );
        if (isEqual){
            System.out.println("Both Tree leaf are equals!!");
        }else {
            System.out.println("Both Tree leaf are not equals!!");
        }
    }
}
