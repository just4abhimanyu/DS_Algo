package com.av.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    private static List<Integer> levelOrderTraversal(TreeNode treeNode){

        if(treeNode == null){
            return List.of();
        }
        // using queue here because . queue follow FIFO. the order in which adding node same way will look for their child node.
        Queue<TreeNode> queue = new LinkedList<>(); // this queue used for to store each root node . by using this root node we can get left and right node.
        queue.add(treeNode); // adding 1st root node of tree.

        List<Integer> levelOrderTraversalNode = new LinkedList<>();// used for storing traversal result

        while(!queue.isEmpty()){ // here checking each node

            levelOrderTraversalNode.add(queue.peek().val); // adding root node data

            TreeNode node = queue.poll();// removing from queue to check their child node

            if(node.left != null){ // checking for left node

                queue.add(node.left); // adding node if present
            }
            if(node.right != null){ // checking right nod of that root node

                queue.add(node.right); // adding node if present
            }
        }
        return levelOrderTraversalNode;
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(20);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(6);

        List<Integer> levelOrderNodes = levelOrderTraversal(tree);
        System.out.println(levelOrderNodes);
    }

}
