package DataStructure;

public class LinkedList {
    private Node first; // The head (first node) of the linked list
    private int size;   // Number of elements in the linked list

    // We do not write a constructor here because both 'first' (null) and 'size' (0)
    // automatically have their default values. However, we can explicitly initialize them if needed.
    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    // Adds a new element to the beginning of the linked list
    public void addFirst(int element) {
        // No need for exception handling because a linked list is dynamic in size.
        Node newNode = new Node(element); // Create a new node
        newNode.next = first;             // Point the new node to the current first node
        first = newNode;                  // Update the first node to the new node
        size++;                           // Increment the size of the list
    }

    // Adds a new element to the end of the linked list
    public void addLast(int element) {
        Node newNode = new Node(element); // Create a new node
        if (first == null) {              // If the list is empty
            first = newNode;              // The new node becomes the first node
            size++;
            return;
        }
        Node last = first;                // Start from the first node
        while (last.next != null) {       // Traverse to the last node
            last = last.next;
        }
        last.next = newNode;              // Attach the new node at the end
        size++;                           // Increment the size
    }

    // Adds an element at a specific index in the list
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(); // Ensure the index is within bounds
        }
        if (index == 0) {
            addFirst(element); // Add at the beginning
            return;
        }
        if (index == size) {
            addLast(element); // Add at the end
            return;
        }
        Node previous = first;
        for (int i = 1; i <= index - 1; i++) {
            previous = previous.next; // Traverse to the node before the target index
        }
        Node newNode = new Node(element);
        newNode.next = previous.next;  // Link the new node to the next node
        previous.next = newNode;       // Link the previous node to the new node
        size++;
    }

    // Removes and returns the first element in the list
    public int removeFirst() throws ListEmptyException {
        if (first == null) {
            throw new ListEmptyException(); // List is empty, cannot remove
        }
        int data = first.data; // Save the data of the first node
        first = first.next;    // Update the first node to the next node
        size--;                // Decrease the size
        return data;
    }

    // Removes and returns the last element in the list
    public int removeLast() throws ListEmptyException {
        if (first == null) {
            throw new ListEmptyException(); // List is empty, cannot remove
        }
        Node p = first;
        while (p.next.next != null) { // Traverse to the second last node
            p = p.next;
        }
        int data = p.next.data; // Save the data of the last node
        p.next = null;          // Remove the last node
        size--;
        return data;
    }

    // Removes and returns the element at a specific index
    public int remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(); // Ensure the index is valid
        }
        if (index == 0) {
            return removeFirst(); // Remove from the beginning
        }
        if (index == size - 1) {
            return removeLast(); // Remove from the end
        }
        Node p = first;
        for (int i = 1; i <= index - 1; i++) {
            p = p.next; // Traverse to the node before the target index
        }
        int data = p.next.data;   // Save the data of the node to be removed
        p.next = p.next.next;     // Skip the node to remove it
        size--;
        return data;
    }

    // Recursive helper method to print the list in reverse
    private void printReverseRecursive(Node node) {
        if (node == null) {
            return; // Base case: reached the end of the list
        }
        printReverseRecursive(node.next); // Recursive call to the next node
        System.out.print(node.data + " "); // Print data during backtracking
    }

    // Public method to print the list in reverse
    public void printReverse() {
        System.out.print("[");
        printReverseRecursive(first); // Start recursion from the first node
        System.out.print("]");
    }

    // Merges two sorted linked lists into a new sorted linked list
    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        LinkedList l3 = new LinkedList(); // Create a new list
        Node p = l1.first;
        while (p != null) { // Add all elements from the first list
            l3.addLast(p.data);
            p = p.next;
        }
        p = l2.first;
        while (p != null) { // Add all elements from the second list
            l3.addLast(p.data);
            p = p.next;
        }
        return l3;
    }

    // Prints the list in a detailed format
//    public void print() {
//        if (first == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        Node current = first;
//        System.out.print("LinkedList: ");
//        while (current != null) {
//            System.out.print(current.data);
//            if (current.next != null) {
//                System.out.print(" -> ");
//            }
//            current = current.next;
//        }
//        System.out.println("\nSize: " + size);
//    }

    //
    public void print() {
        // using current node to check do we reached to the end of the linked-list or not
        Node current = first;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList w = new LinkedList();
        w.addLast(1);
        w.addLast(2);
        w.addLast(3);
        w.print();
        w.printReverse(); // Demonstrates the reverse print functionality
    }
}

class ListEmptyException extends Exception {
}




//package DataStructure;
//
//public class LinkedList {
//    private Node first;
//    private int size;
//    // we do not need to write constructor because 'first' node does not refer to any node and 'size' has zero value
//    // we do not write constructor here because 'first' and 'size' have their default value
//    // we use constructor if we want to use any value except default value
//
//    public LinkedList() {
//        this.first = null;
//        this.size = 0;
//
//    }
//
//    public void addFirst(int element) {
//        // we do not use exception here because we do not have problem for being linedList full
//        // but in the array we used exception because we had problem for being Array full
//        // addFirst has O(1)
//        Node newNode = new Node(element);
//        newNode.next = first;
//
//        first = newNode;
//
//        size++;
//    }
//
//    public void addLast(int element) {
//        Node newNode = new Node(element);
//
//        if (first == null) {
//            first = newNode;
//            size++;
//            return;
//        }
//
//        // last node points to the first node
//        Node last = first;
//
//        while (last.next != null) {
//            // To refer one node to another node we write: oneNode = anotherNode.next;
//            last = last.next;
//        }
//        last.next = newNode;
//
//        size++;
//    }
//
//    public void add(int index, int element) {
//        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException();
//        }
//        // add element in first index
//        if (index == 0) {
//            addFirst(element);
//            return;
//        }
//
//        // add element in last index
//        if (index == size) {
//            addLast(element);
//            return;
//        }
//
//        // add element between first index and last index
//        Node previous = first;
//        // for (int i = 1; i < index; i++) {
//        // OR
//        for (int i = 1; i <= index - 1; i++) {
//            previous = previous.next;
//        }
//        Node newNode = new Node(element);
//        newNode.next = previous.next;
//        previous.next = newNode;
//
//        size++;
//    }
//
//    public int removeFirst() throws ListEmptyException {
//        if (first == null) {
//            throw new ListEmptyException();
//        }
//        // check if this code works for a list with one node or not
////        if (first.next == null) {
////            int data = first.data;
////            first = null;
////            size--;
////            return data;
////        }
//
//
//        // first of all we need to keep data (int data = first.data;) and then (first = first.next;)
//        int data = first.data;
//        first = first.next;
//        size--;     // don't forget to reduce size in the removeFirst() method
//        return data;
//    }
//
//    public int removeLast() throws ListEmptyException {
//        // in every data structure first check being full or empty when removing
//        if (first == null) {
//            throw new ListEmptyException();
//        }
//        Node p = first;
//        while (p.next.next != null) {    // condition : when p.next.next is not the last node
//            p = p.next;
//        }
//        int data = p.next.data;
//        p.next = null;  // removing the last node
//        size--;
//        return data;
//    }
//
//    // remove element from the desired location
//    public int remove(int index) throws Exception{
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException();
//        }
//        if (index == 0) {
//            return removeFirst();
//        }
//        if (index == size - 1) {
//            return removeLast();
//        }
//
//        Node p = first;
//        for (int i = 1; i <= index - 1; i++) {
//            p = p.next;
//        }
//        int data = p.next.data;         // OR 'Node current = p.next;'      int data = current.data;
//        p.next = p.next.next;           // OR 'p.next = current.next;'
//        size--;
//        return data;
//    }
//
//    private void printReverseRecursive(Node node) {
//        if (node == null) {
//            return;
//        }
//        printReverseRecursive(node.next);
//        System.out.print(node.data + " ");
//    }
//
//    public void printReverse() {
//        System.out.print("[");
//        printReverseRecursive(first);
//        System.out.print("]");
//    }
//
//    // write a static method that receive 2 arranged list of numbers and merge them in a way that the new list be arranged
//    public static LinkedList merge(LinkedList l1, LinkedList l2) {
//        LinkedList l3 = new LinkedList();
//        Node p = l1.first;
//        while (p != null) {
//            l3.addLast(p.data);
//            p = p.next;
//        }
//
//        p = l2.first;
//        while (p != null) {
//            l3.addLast(p.data);
//            p = p.next;
//        }
//
//        return l3;
//    }
//
//    public static void what(Node p) {
//        if (p != null) {
//            what(p.next);
//            System.out.print(p.data + " ");
//            what(p.next);
//            System.out.print(p.data + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedList w = new LinkedList();
//        w.addLast(1);
//        w.addLast(2);
//        w.addLast(3);
//        what(w.first);
//    }
//
//
//    public void print() {
//        if (first == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//
//        Node current = first;
//        System.out.print("LinkedList: ");
//        while (current != null) {
//            System.out.print(current.data);
//            if (current.next != null) {
//                System.out.print(" -> ");
//            }
//            current = current.next;
//        }
//        System.out.println("\nSize: " + size);
//    }
//
//    public void printAgain() {
//        // using current node to check do we reached to the end of the linked-list or not
//        Node current = first;
//        System.out.print("[");
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.print("]");
//        System.out.println();
//    }
//
//}
//class ListEmptyException extends Exception {
//}


