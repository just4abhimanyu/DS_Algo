package com.av.ds.stack;

import com.av.ds.linkedlist.Node;
import com.av.ds.linkedlist.PrintLinkedList;

public class StackUsingLinkedList {
    private static Node head;

    private static void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    private static int pop(){
        int data = head.data;
        // doing pop operation
        head = head.next;
        return data;
    }
    private static int peek(){
        return head.data;
    }
    private static boolean isEmpty(){
        return head.next == null;
    }

    public static void main(String[] args) {
        for (int i = 10; i <=100; i+=10) {
            push(i);
        }
        PrintLinkedList.printList(head);
    }
}
