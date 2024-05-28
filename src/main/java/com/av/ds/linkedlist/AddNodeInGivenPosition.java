package com.av.ds.linkedlist;

public class AddNodeInGivenPosition {
    private static void addNodeInBetween(Node head , int existingNodeData, int additionData){
        Node tmpNode = head;
        Node newNode = new Node(additionData);
        while (tmpNode != null){

            if(tmpNode.data  == existingNodeData){
                Node tmp = tmpNode.next;
                tmpNode.next = newNode;
                newNode.next = tmp;
            }
            tmpNode = tmpNode.next;
        }
    }

    public static void main(String[] args) {
        int existingNodeData = 10;
        int additionData = 15;
        AddNodes addNodes = new AddNodes();
        addNodes.addNode(10);
        addNodes.addNode(20);
        addNodes.addNode(30);
        Node head =  addNodes.addNode(40);
        PrintLinkedList.printList(head);
        addNodeInBetween(head , existingNodeData , additionData);
        PrintLinkedList.printList(head);
    }
}
