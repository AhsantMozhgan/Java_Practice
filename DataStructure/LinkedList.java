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

    public boolean isEmpty() {
        return size == 0;
    }

    // demonstrate the mergeWithOutNewList method without creating any new list
    public static LinkedList mergeWithOutNewList(LinkedList l1, LinkedList l2) {
        if (l1.isEmpty()) {
            l1.first = l2.first;
            l1.size = l2.size;
        } else if (!l2.isEmpty()) {
            Node last = l1.first;
            while (last.next != null) {
                last = last.next;
            }

            last.next = l2.first;
            l1.size += l2.size;
        }
        l2.first = null;
        l2.size = 0;
        return l1;
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

    public static void main(String[] args) throws Exception {
        LinkedList w = new LinkedList();

        // Test adding elements using addLast
        System.out.println("Adding elements to the end of the list:");
        w.addLast(1);
        w.addLast(2);
        w.addLast(3);
        w.print(); // Expected: LinkedList: 1 -> 2 -> 3, Size: 3

        // Test adding elements at specific indexes using add
        System.out.println("\nAdding element at the beginning of the list:");
        w.add(0, 0); // Add 0 at the beginning
        w.print(); // Expected: LinkedList: 0 -> 1 -> 2 -> 3, Size: 4

        System.out.println("\nAdding element in the middle of the list:");
        w.add(2, 5); // Add 5 at index 2
        w.print(); // Expected: LinkedList: 0 -> 1 -> 5 -> 2 -> 3, Size: 5

        System.out.println("\nAdding element at the end of the list:");
        w.add(5, 10); // Add 10 at the end
        w.print(); // Expected: LinkedList: 0 -> 1 -> 5 -> 2 -> 3 -> 10, Size: 6

        // Test reverse printing
        System.out.println("\nPrinting the list in reverse:");
        w.printReverse(); // Expected: [10 3 2 5 1 0]

        System.out.println("\nRemoving the first element:");
        System.out.println("Removed element: " + w.removeFirst()); // Expected: 0
        w.print(); // Expected: LinkedList: 1 -> 5 -> 2 -> 3 -> 10, Size: 5

        System.out.println("\nRemoving the last element:");
        System.out.println("Removed element: " + w.removeLast()); // Expected: 10
        w.print(); // Expected: LinkedList: 1 -> 5 -> 2 -> 3, Size: 4

        System.out.println("\nRemoving element at index 2:");
        System.out.println("Removed element: " + w.remove(2)); // Expected: 2
        w.print(); // Expected: LinkedList: 1 -> 5 -> 3, Size: 3

//        print mergeWithOutNewList
        System.out.println("\nTesting mergeWithOutNewList:");
        LinkedList  l1 = new LinkedList();
        l1.addLast(2);
        l1.addLast(3);
        System.out.print("l1 before merge: ");
        l1.print();

        LinkedList l2 = new LinkedList();
        l2.addLast(22);
        l2.addLast(33);
        l2.addLast(44);
        System.out.print("l2 before merge: ");
        l2.print();

        System.out.print("\nAfter merge: ");
        LinkedList.mergeWithOutNewList(l1, l2);
        l1.print();

        System.out.print("\nl2 after merge (should be empty): ");
        l2.print();


    }

}

class ListEmptyException extends Exception {
}
