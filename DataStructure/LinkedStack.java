package DataStructure;

import java.lang.invoke.DelegatingMethodHandle$Holder;

public class LinkedStack {
    // before we got an array as an attribute, but now we get a linked list as attribute and make it new here
    private LinkedList s = new LinkedList();

    public  void push(int element) {
        s.addFirst(element);
    }

    public int pop() throws ListEmptyException {
        return s.removeFirst();
    }
}
