package com.av.ds.graph.bfs;

import com.av.ds.graph.BinaryTree;
import com.av.ds.graph.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindNodeWhoHaveTwoChildNode {

    private static void getCompleteBinaryTreeNode(TreeNode root){
        List<Integer> listOfRootNode = new ArrayList<>();
       collectNodes(root , listOfRootNode , 0);
       System.out.println("List Of Complete Node :"+listOfRootNode);
    }
    private static void collectNodes(TreeNode root , List<Integer> result , int level){
        if (root == null) return;

        if (root.left != null && root.right != null) {
            result.add(root.val);
        }
        collectNodes(root.left, result , level + 1);
        collectNodes(root.right, result , level + 1);

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode rootNode = tree.createTreeByList(List.of(4,2,7,1,3));
        getCompleteBinaryTreeNode(rootNode);

    }
}
