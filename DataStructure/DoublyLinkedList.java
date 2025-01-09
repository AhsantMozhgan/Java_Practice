package DataStructure;

import jdk.jshell.spi.SPIResolutionException;

public class DoublyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            // The list was previously empty.
            //A new node (newNode) has just been created.
            //This new node becomes both the first and last element of the list.
            first = last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }


    public void addLast(int element) {
        if(isEmpty()) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
        size--;

    }

    public void print() {
        System.out.print("[");
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("]");
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Adding elements:");
        for (int i = 30; i >= 5; i-=5) {
            list.addFirst(i);
        }
        list.addLast(100);
        list.print();

    }

}
