package com.av.ds.linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private  void insert(int data){
        Node new_node = new Node(data);
        if(head == null ){
            head = new_node;
            tail =new_node;
            tail.next = head; // making circular
        }else {
            tail.next = new_node;
            tail = new_node;
            tail.next = head; // Update tail's next to point to head to maintain circularity
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Inserting elements into the circular linked list
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);
        circularList.insert(5);
        // Displaying the circular linked list
        System.out.println("Circular Linked List:");
        PrintLinkedList.printCircularLinkedList(circularList.head);
    }
}
