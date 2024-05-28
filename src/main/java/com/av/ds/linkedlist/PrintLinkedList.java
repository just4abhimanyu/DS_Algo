package com.av.ds.linkedlist;

public class PrintLinkedList {
    public static void printList(Node head) {
        Node current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void printCircularLinkedList(Node head){
        Node current = head;
        if(current == null) {
            System.out.println("Linked list is Empty!!");
            return;
        }

        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while (current != head);

    }
}
