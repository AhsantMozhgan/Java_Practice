package DataStructure;
public class StackCustom {
    private int stack[];
    private int top;

    public StackCustom() {
        this(10);
    }

    public StackCustom(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++top] = item;
    }

    public int getSize() {
        return top + 1;
    }

    public int getCapacity() {
        return stack.length;
    }

    // pop
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return stack[top--];

    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return stack[top];

    }

    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == stack.length - 1;
    }

    // peek index
    public int peekNum(int num) {
        if (!isEmpty() && num >= 1 && num <= getSize()) {
            System.out.println("peeked number is:" + peek());
            return stack[num - 1];
        }
        System.out.println("Can't peek the number!");
        return -1;
    }


    public int popNum(int num) {
        if (num <= 0 || num > getSize()) {
            System.out.println("Invalid number of elements to pop!");
            return -1;
        }
        int result = -1;
        for (int i = 1; i <= num; i++) {
            result = pop();
            System.out.println("result is: " + result);
        }
        return result;
    }


    public int popJump() {
        pop();
        return pop();
    }

    public void pushArray(int[] arrayItem) {
        if (arrayItem == null || arrayItem.length == 0) {
            System.out.println("No items to push.");
            return;
        }
        for (int i = 0; i < arrayItem.length; i++) {
            push(arrayItem[i]);
        }
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
        StackCustom stack = new StackCustom(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }

        System.out.println("Initial stack:");
        stack.printStack();
        System.out.println("Initial size: " + stack.getSize());

        stack.reverseStack();

        System.out.println("Final stack:");
        stack.printStack();
        System.out.println("Final size: " + stack.getSize());

    }

//    public static void main(String[] args) {
        //StackCustom stack = new StackCustom(6);
        //int[] arrayToPush = {70, 80, 90, 100};
        //stack.pushArray(arrayToPush);

        //System.out.println("Size is:" + stack.getSize());
        //System.out.println("poped from array pushed: " + stack.pop());


//        StackCustom stack = new StackCustom(5);
//        for (int i = 1; i <= 5; i++) {
//            stack.push(i * 10);
//        }
//
//        System.out.println("Size is:" + stack.getSize());
//
//        stack.printStack();
//        stack.reverseStack();
//        stack.reverseStack();
//
//        // System.out.println("Size is:" + stack.getSize());
//
//
//        // System.out.println("Stack peeked index is: " + stack.peekNum(2));
//        // System.out.println("poped item at index is: " + stack.popNum(3));
//        // System.out.println("poped jump is:" + stack.popJump());
//

//    }
}