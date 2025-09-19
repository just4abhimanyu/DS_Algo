package com.av.ds.linkedlist;

public class CreateLinkedList {
    Node head;
    public static void main(String[] args) {
        CreateLinkedList lList = new CreateLinkedList();

        lList.addNode(10);
        lList.addNode(20);
        lList.addNode(30);
        lList.addNode(40);

        lList.printLinkedList(lList.head);

        lList.reversedLinkedList();

        lList.printLinkedList(lList.head);
    }
    private void addNode(int data){
        if (head == null){
            head = new Node(data);
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    private Node reversedLinkedList(){
        if (head == null){
            return null;
        }

        Node prev = head;
        Node current = head.next;
        while(current !=null){
            Node nextNode = current.next;
            current.next = prev;

            // updating created var
            prev = current;
            current = nextNode;
        }
        head.next = null;
        head = prev;

        return head;

    }

    private void printLinkedList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
