package com.av.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseNodeLeftToRightAndRightToLeft {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(6);

        // print node
        List<Integer> gickJackTraversalNodes = traverseNodeInGickJacWay(treeNode);
        System.out.println(gickJackTraversalNodes);
        //

    }
    /*
       Need to traverse node
        L --> R
        R --> L
        L --> R

     */
    private static List<Integer> traverseNodeInGickJacWay(TreeNode treeNode){

        if(treeNode == null){
            return List.of();
        }
        List<Integer> traversedNode = new LinkedList<>();// for traversal node data

        Queue<TreeNode> queue = new LinkedList<>(); // to add root node
        queue.add(treeNode); // first root node

        boolean isLeftToRight = true; // to control traversal L --> R or R --> L

        while ( !queue.isEmpty() ) {

            TreeNode node = queue.poll(); // removing root node to check left and right node
            traversedNode.add(node.val); // storing root node data to list

            if(isLeftToRight ){ // for L --> R traversal

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                isLeftToRight = false;

            }else { // For R --> L traversal

                if(node.right != null){

                    queue.add(node.right);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
            }
        }

        return traversedNode;
    }
}
