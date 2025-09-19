package com.av.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class AddTwoLinkedListNumbers {
    private Node addNode(Node head, int data) {

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
private Node addElement(int[] arr){
    Node head = null;
    for (int data : arr) {
        head = addNode(head, data);
        }
    return head;
}

    public static void main(String[] args) {
        int[] arr1 = {2,4,3};
        int[] arr2 = {5,6,4};
        AddTwoLinkedListNumbers obj = new AddTwoLinkedListNumbers();
        Node ll1 = obj.addElement(arr1);
        obj.print(ll1);
        Node ll2 = obj.addElement(arr2);
        obj.print(ll2);
        Node finalNode = obj.addTwoNumbers(ll1,ll2);
        System.out.println("------- final List ------");
        obj.print(finalNode);
    }
    private void print(Node head){
        while (head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public Node addTwoNumbers(Node l1, Node l2) {
        Set<Integer> count= new HashSet<>();
        Node list1 = reverseList(l1,count);

        count = new HashSet<>();
        Node list2 = reverseList(l2,count);
        int carry = 0;
        Node resultNode = new Node(0);
        Node ptr = resultNode;
        while(list1 != null || list2 != null){
            int sum = 0 + carry;

            if(list1 !=null){
                sum += list1.data;
                list1 = list1.next;
            }

            if(list2 !=null){
                sum += list2.data;
                list2 = list2.next;
            }

      carry = sum/10;
            sum %= 10;

            ptr.next = new Node(sum);
            ptr = ptr.next;

        }
        if(carry == 1){
            ptr.next = new Node(1);
        }
        return resultNode.next;
    }
    private Node reverseList(Node head, Set<Integer> count){
        int size = 0;
        if(head == null || head.next == null){
            count.add(size);
            return head;
        }
        Node prev = head;
        Node current = head.next;
        while(current != null){
            Node nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
            size++;
        }

        head.next = null;
        head = prev;
        count.add(size);

        return head;
    }
}
