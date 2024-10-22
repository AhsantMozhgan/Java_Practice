package DataStructure;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
//        Node a  = new Node(2);
//        Node b  = new Node(5);
//        Node c  = new Node(7);
//
//        a.next = b;
//        b.next = c;

//        // another way to connect these three nodes is:
//        Node first  = new Node(2);
//        Node last = first;
//
//        last.next = new Node(5);
//        last = last.next;
//
//        last.next = new Node(7);
//        last = last.next;

        // using for-loop to connect nodes
        // we put first node outside of loop
        Node first = new Node(7);
        Node last = first;

        for (int i = 14; i <= 100; i+=7) {
            last.next = new Node(i);
            last = last.next;
        }

        // using current node to check do we reached to the end of the linked-list or not
        Node current = first;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("]");
    }
}
