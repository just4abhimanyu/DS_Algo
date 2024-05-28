package com.av.ds.graph;

import com.av.ds.linkedlist.Node;

import java.util.List;

public class BinaryTree {

    TreeNode rootNode;

    public void insertNode(int data){
        rootNode = addNode(rootNode , data);
    }
    private static TreeNode addNode(TreeNode root , int data){
        if (root == null){
            root = new TreeNode(data);
        }else if (root.val > data){
            root.left = addNode(root.left , data);
        }else if(root.val < data){
            root.right = addNode(root.right , data);
        }
        return root;
    }
    public void inOrderTraversal(TreeNode root){

        if (root != null){
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
    public void preOrderTraversal(TreeNode root){

        if (root != null){
            System.out.print(root.val+ " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public TreeNode createTreeByList(List<Integer> list){
        for (int data : list){
            insertNode(data);
        }
        return rootNode;
    }
}
