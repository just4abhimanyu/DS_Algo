package com.av.ds.graph.bfs;

import com.av.ds.graph.BinaryTree;
import com.av.ds.graph.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class FindNodeAndRespectiveChildNode {
    public static void findNodeAndRespectiveTree(TreeNode root , int lookingNode){
        List<Integer> result = new ArrayList<>();
        TreeNode newTreeNode = getRootNodeByNodeValue(root , lookingNode);
        printSubTree(newTreeNode, result, 0);
        System.out.println(result);


    }
    private static TreeNode getRootNodeByNodeValue(TreeNode root , int lookingNode){
        while (root != null){
            if(lookingNode > root.val){
                root = root.right;
            } else if (lookingNode < root.val) {
                root = root.left;
            }else {
                return root;
            }
        }
        return root;
    }
    private static void printSubTree(TreeNode root , List<Integer> result , int level) {

        if (root == null) { return; }

        result.add(root.val);
        printSubTree(root.left , result, level +1);
        printSubTree(root.right , result, level +1);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode rootNode = tree.createTreeByList(List.of(4,2,7,1,3));
        int findingNode = 5;
        findNodeAndRespectiveTree(rootNode ,findingNode);
    }
}
