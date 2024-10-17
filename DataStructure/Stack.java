package DataStructure;

class StackFullException extends RuntimeException {
//class StackFullException {
}

class StackEmptyException extends Exception {

}

public class Stack {
    // the length of this array is zero here because there's no space for this array in the memory.
    // when we make new object we get space for this array in the memory.
    private int s[];
    private int top = -1;        // this means stack is empty


    public Stack() {
        s = new int [10];       // or 'this(10);'
    }

    public Stack(int size) {
        s = new int [size];
    }

    public void push (int item) {
        // check if the stack is full or not, if it is full throw exception
        if (top == s.length - 1) {
            throw new StackFullException();     // this class is defined on top

//            // if the stack is full add new cell and push item
//            ++top;
//            s[top] = item;
//            // OR
//            //s[++top] = item;
//            //s[top++] = item;      // incorrect

        }
        // if the stack is full add new cell and push item
//        ++top;
//        s[top] = item;
        // OR
        s[++top] = item;
        //s[top++] = item;      // incorrect
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
//        --top;
//        return s[top];

        // OR
        return s[top--];
    }

    //peek is like pop, but it does not delete, and it just shows the top item
    public int peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        return s[top];
    }
}









// Generic definition
// if we want to do not define the type of the element, we use generic definition.
// for example <T> here is something Undefined which is not 'int' or it is not 'String' or anything else
// when the type of <T> will be defined? when we want to create new object from Stack<T> class
//public class Stack<T> {
//    private T s[];
//}
