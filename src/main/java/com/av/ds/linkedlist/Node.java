package com.av.ds.linkedlist;

public class Node {
    public int data;
    public Node next;
    Node(){}
    public Node(int val){
        this.data = val;
    }
    public Node(int val , Node next){
        this.data = val;
        this.next = next;
    }
}
