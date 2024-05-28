package com.av.ds.linkedlist;

public class DeleteMiddleNode {

    public static Node deleteMiddleNode(Node head) {

        if(head==null || head.next==null) {
                return null;
        }
        Node fast = head, slow = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node toDelete = slow.next;
        slow.next = slow.next.next;

        return head;

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

        // Delete the middle node
        deleteMiddleNode(head);

        // Print the list after deletion
        System.out.println("\nList after deleting middle node:");
        PrintLinkedList.printList(head);
    }
}
