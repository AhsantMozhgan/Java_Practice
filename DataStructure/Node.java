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

        // another way to connect these three nodes is:
        Node first  = new Node(2);
        Node last = first;

        last.next = new Node(5);
        last = last.next;

        last.next = new Node(7);
        last = last.next;


    }
}
