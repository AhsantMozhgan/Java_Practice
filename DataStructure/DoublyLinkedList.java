package DataStructure;

import jdk.jshell.spi.SPIResolutionException;

import java.util.concurrent.atomic.DoubleAccumulator;

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

    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        if (index == size -1) {
            addLast(element);
            return;
        }

        Node current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(element);
        newNode.prev = current;
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        size++;


//         OR
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//        Node newNode = new Node(element);
//        newNode.prev = current.prev;
//        newNode.next = current;
//        current.prev.next = newNode;
//        current.prev = newNode;
//        size++;
    }


    public int removeFirst() {
        if(isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        int data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        else {
            first.prev = null;
        }
        size--;
        return data;
    }

    public  int removeLast() {
        if (isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        int data = last.data;
        last = last.prev;
        if(last == null) {
            last = null;
        } else {
            last.next = null;
        }
        size--;
        return data;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size -1) {
            return removeLast();
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        int data = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
        return data;



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
        list.add(1, 222);
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        list.print();
    }
}
