package com.av.ds.linkedlist;

public class AddNodes {
    Node head;
    public  Node addNode(int data){
        if(head == null){
            head = new Node(data);
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }
}
