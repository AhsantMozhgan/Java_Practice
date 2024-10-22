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
        Node newNode = new Node(element);
        newNode.next = first;
    }

}
