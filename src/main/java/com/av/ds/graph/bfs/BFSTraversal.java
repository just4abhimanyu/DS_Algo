package com.av.ds.graph.bfs;

import com.av.ds.graph.BinaryTree;
import com.av.ds.graph.TreeNode;
import java.util.List;

public class BFSTraversal {

    public static void main(String[] args) {
        List<Integer> list = List.of(8,7,12,15,2,7);
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.createTreeByList(list);

        tree.inOrderTraversal(root);
        System.out.println();
        tree.preOrderTraversal(root);
    }
}
