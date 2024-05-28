package com.av.ds.linkedlist;

public class ReversedLinkedList {

        private static Node reverseLinkedList(Node head ){
            Node prev = null;
            Node current = head;
            Node next ;
            while (current.next != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the original list
        System.out.println("Original List:");
        PrintLinkedList.printList(head);

        // Reverse the list
        Node reversedHead =  reverseLinkedList(head);

        // Print the reversed list
        System.out.println("\nReversed List:");
        PrintLinkedList.printList(reversedHead);
    }


}
