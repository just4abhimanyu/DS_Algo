import java.util.List;

class LinkedList {
    LinkedList previous;
    LinkedList next;
    int data;

    LinkedList(int data) {
        next = null;
        previous = null;
        this.data = data;
    }

}

class CustomStack {
    private int[] stack = null;
    private int top = -1;
    CustomStack(int top){
        this.top = top;
    }




}
public class Test {
private int[] stack = null;
    public static LinkedList addNode(int data , LinkedList head) {
        LinkedList newNode = new LinkedList(data);
        LinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    private static void convertLinkedListToStack(LinkedList head) {
        LinkedList temp = head;
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        LinkedList linkedList = addNode(10, head);
        LinkedList linkedList1 = addNode(20, linkedList);
        LinkedList linkedList2 = addNode(30, linkedList1);


    }
}
