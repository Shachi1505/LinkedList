public class Node{
    char data;
    Node next;
    Node(char data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head = null, tail = null;
    void insert(char val){
        if(head == null){
            head = tail = new Node(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }
    public void print() {
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            if(curr.next != null)
            System.out.println("->");
            curr = curr.next;
        }
    }
