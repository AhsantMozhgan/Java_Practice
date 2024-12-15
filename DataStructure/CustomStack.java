package DataStructure;

public class CustomStack {
    // Array to store stack elements
    private int[] stack;
    // Index of the top element, -1 when stack is empty
    private int top;

    // Default constructor, creates a stack of size 10
    public CustomStack() {
        this(10);
    }

    // Constructor with custom size
    public CustomStack(int size) {
        stack = new int[size];
        top = -1;  // Initialize top to -1 (empty stack)
    }

    // Adds an item to the top of the stack
    public void push(int item) {
        // Check if stack is full before pushing
        if (isFull()) {
            System.out.println("Can't push because stack is full!");
            return;
        }
        // Increment top and add item
        stack[++top] = item;
    }

    // Removes and returns the top item from the stack
    public int pop() {
        // Check if stack is not empty before popping
        if (!isEmpty()) {
            // Return top item and decrement top
            return stack[top--];
        }
        System.out.println("Can't pop because stack is empty!");
        return -1;  // Return -1 to indicate error (empty stack)
    }

    // Pushes an array of integers onto the stack
    public void pushArray(int[] items) {
        // Check if the input array is valid
        if (items == null || items.length == 0) {
            System.out.println("No items to push.");
            return;
        }

        // Calculate how many items can be pushed
        int availableSpace = getCapacity() - getSize();
        int itemsToPush = Math.min(items.length, availableSpace);

        // Push items onto the stack
        for (int i = 0; i < itemsToPush; i++) {
            push(items[i]);
        }

        // Provide feedback on the operation
        if (itemsToPush < items.length) {
            System.out.println("Stack full. Pushed " + itemsToPush + " out of " + items.length + " items.");
        } else {
            System.out.println("Successfully pushed " + itemsToPush + " items onto the stack.");
        }
    }

    // Pops multiple elements and returns the last popped item
    public int popNum(int num) {
        // Validate the number of elements to pop
        if (num <= 0 || num > getSize()) {
            System.out.println("Invalid number of elements to pop!");
            return -1;
        }
        int result = -1;
        // Pop 'num' elements, keeping the last one as the result
        for (int i = 0; i < num; i++) {
            result = pop();
        }
        return result;
    }

    // Pops two elements and returns the second popped item
    public int popJump() {
        // Ensure there are at least two elements to pop
        if (getSize() < 2) {
            System.out.println("Not enough elements to pop jump!");
            return -1;
        }
        pop();  // Pop and discard the first element
        return pop();  // Pop and return the second element
    }

    // Returns the top item without removing it
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        System.out.println("Can't peek because stack is empty!");
        return -1;
    }

    // Returns the item at a specific position from the top
    public int peekNum(int num) {
        // Validate the position to peek
        if (!isEmpty() && num >= 1 && num <= getSize()) {
            return stack[top - num + 1];
        }
        System.out.println("Can't peek the number!");
        return -1;
    }

    // Checks if the stack is full
    public boolean isFull() {
        return top == stack.length - 1;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns the current number of elements in the stack
    public int getSize() {
        return top + 1;
    }

    // Returns the maximum capacity of the stack
    public int getCapacity() {
        return stack.length;
    }


    public void reverseStack() {
//        System.out.println("Original stack:");
//        printStack();

        int[] newStack = new int[stack.length];
        int originalSize = getSize();

        for (int i = 0; i < originalSize; i++) {
            newStack[i] = pop();
        }

        System.out.println("After popping all elements:");
        printStack();

        for (int i = 0; i < originalSize; i++) {  // Use originalSize here
            push(newStack[i]);
        }

        System.out.println("Stack reversed!");
    }


    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack from bottom to top: ");

        for (int i = 0; i < getSize(); i++) {

            System.out.print(stack[i] + " \t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        // Test pushing individual elements
        for (int i = 1; i <= 3; i++) {
            stack.push(i * 10);
        }

        // Test pushing an array
        int[] arrayToPush = {40, 50, 60, 70};
        stack.pushArray(arrayToPush);

        System.out.println("Stack size after operations: " + stack.getSize());
        System.out.println("Top element: " + stack.peek());

        // Test various stack operations
        System.out.println("\nTesting popJump:");
        System.out.println(stack.popJump());  // Should print 40

        System.out.println("\nTesting peekNum:");
        System.out.println(stack.peekNum(1));  // Should print 30
        System.out.println(stack.peekNum(2));  // Should print 20

        System.out.println("\nPopping remaining elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

//        StackCustom stack = new StackCustom(5);
//        for (int i = 1; i <= 5; i++) {
//            stack.push(i * 10);
//        }
//
//        System.out.println("Initial stack:");
//        stack.printStack();
//        System.out.println("Initial size: " + stack.getSize());
//
//        stack.reverseStack();
//
//        System.out.println("Final stack:");
//        stack.printStack();
//        System.out.println("Final size: " + stack.getSize());
    }
}