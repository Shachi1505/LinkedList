public Node class {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Sol3 {
   Node head = null, tail = null;
   void insert(int val) {
    if(head == null){
        head = tail = new Node(val);
        return;
    }
    tail.next = new Node(val);
    tail = tail.next;
   } 
   public void print() {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.data);
        if(curr.next != null)
            System.out.print("->");
        curr = curr.next;
    }
}
}
public class Main{
    public static void Count(Node head){
        int odd = 0, even =0;
        while(head != null){
            if(head.data % 2 == 1){
                odd++;
            } else {
                even ++;
            }
            head = head.next;
        }
        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); // Take input
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n; i++) {
            l1.insert(sc.nextInt());
        }
        printCount(l1.head);

      }  
    }
