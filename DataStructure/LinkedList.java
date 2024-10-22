package DataStructure;

public class LinkedList {
    private Node first;
    private int size;
    // we do not need to write constructor because 'first' node does not refer to any node and 'size' has zero value
    // we do not write constructor here because 'first' and 'size' have their default value
    // we use constructor if we want to use any value except default value

    public void addFirst(int element) {
        // we do not use exception here because we do not have problem for being linedList full
        // but in the array we used exception because we had problem for being Array full
        // addFirst has O(1)
        Node newNode = new Node(element);
        newNode.next = first;

        first = newNode;

        size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);

        if (first == null) {
            first = newNode;
            size++;
            return;
        }

        // last node points to the first node
        Node last = first;

        while (last.next != null) {
            // To refer one node to another node we write: oneNode = anotherNode.next;
            last = last.next;
        }
        last.next = newNode;

        size++;
    }

    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // add element in first index
        if (index == 0) {
            addFirst(element);
            return;
        }

        // add element in last index
        if (index == size) {
            addLast(element);
            return;
        }

        // add element between first index and last index
        Node previous = first;
        // for (int i = 1; i < index; i++) {
        // OR
        for (int i = 1; i <= index - 1; i++) {
            previous = previous.next;
        }
        Node newNode = new Node(element);
        newNode.next = previous.next;
        previous.next = newNode;

        size++;
    }

    public int removeFirst() throws ListEmptyException {
        if (first == null) {
            throw new ListEmptyException();
        }
        // first of all we need to keep data (int data = first.data;) and then (first = first.next;)
        int data = first.data;
        first = first.next;
        size--;     // don't forget to reduce size in the removeFirst() method
        return data;
    }

    public class ListEmptyException extends Exception {
    }


    public void print() {
        if (first == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = first;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println("\nSize: " + size);
    }

    public void printAgain() {
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
