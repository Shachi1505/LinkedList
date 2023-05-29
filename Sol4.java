public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class Sol4 {
    public Node head = null, tail = null;
    public void insert(int val){
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
public class Main{
    public static Node update(Node head){
        int count = 0;
        Node prev = null, curr = head;
        while(curr != null) {
            if(curr.data == 1){
                if(count %2 ==1){
                    prev.next = new Node(0);
                    prev = prev.next;
                    prev.next = curr;
                }
                count =0;
            } else {
                count++;
            }
            prev = curr;
            curr =  curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        ll.head = update(ll.head);
        ll.print();
    }
    }

