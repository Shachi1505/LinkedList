public class Node{
 char data;
 Node next;
 Node(char data)  {
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
     public void print(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            if(curr.next != null)
            System.out.println("->");
            curr = curr.next;
        }
     }
}

public class Sol1 {
    public static Node deleteX(Node head){
        while(head != null && head.data == 'x'){
            Node temp = head;
            head = head.next;
        }
        Node prev = null, curr = head;
        while(curr != null){
            if(curr.data == 'x') {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = prev.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for(int i=0; i<n; i++){
            String c = sc.next();
            l1.insert(c.charAt(0));

        }
        l1.head = deleteX(l1.head);
        l1.print();
    }
}
