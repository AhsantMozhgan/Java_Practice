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

//    public void push (int item) {
//        // check if the stack is full or not, if it is full throw exception
//        if (top == s.length - 1) {
//            throw new StackFullException();     // this class is defined on top
//
////            // if the stack is not full add new cell and push item
////            ++top;
////            s[top] = item;
////            // OR
////            //s[++top] = item;
////            //s[top++] = item;      // incorrect
//
//        }
//        // if the stack is not full add new cell and push item
////        ++top;
////        s[top] = item;
//        // OR
//        s[++top] = item;
//        //s[top++] = item;      // incorrect
//    }

//    double the array length (double the s.length)
    public void push(int item) {
        if (top == s.length - 1) {
            int[] newArray = new int[2 * s.length];

            for (int i = 0; i < s.length; i++) {
                newArray[i] = s[i];
            }
            s = newArray;
        }
        s[++top] = item;
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }

        return s[top--];
    }

    //peek is like pop, but it does not delete, and it just shows the top item
    public int peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        return s[top];
    }

    public boolean isEmpty() {
        return top == -1;       // if (top == -1) return true;
    }

    // This method returns the current number of elements in the stack.
    public int getSize() {
        return top + 1;
    }

    // This method returns the maximum number of elements the stack can hold.
    public int getCapacity() {
        return s.length;
    }
}









// Generic definition
// if we want to do not define the type of the element, we use generic definition.
// for example <T> here is something Undefined which is not 'int' or it is not 'String' or anything else
// when the type of <T> will be defined? when we want to create new object from Stack<T> class
//public class Stack<T> {
//    private T s[];
//}
