package DataStructure;

class QueueFullException extends RuntimeException {
}

class QueueEmptyException extends Exception {
}

public class Queue {
    private int[] q;
    private int f, r;

    public Queue() {
        q = new int[10];
        f = r = 0;
    }

    public void enqueue(int item) {
        // condition for being full is 'rear + 1'
        // n is q.length
        // using this formula to check if the array is full or not: '(rear+1) % n = front'
        if ((r + 1) % q.length == f) {
            throw new QueueFullException();
        }

        // if queue was not full add item to the rear cell
        q[r] = item;    // rear cell is not empty now, and we need to move one cell ahead by 'r++'
//        r++;
//        // if rear reached to the last cell in the array we need to reset rear by putting 'r = 0'
//        if (r == q.length) {
//            r = 0;
//        }

//        OR instead of this:
//        r++;
//        // if rear reached to the last cell in the array we need to reset rear by putting 'r = 0'
//        if (r == q.length) {
//            r = 0;
//        }
//        we can write this:
        r = (r + 1) % q.length;
    }

    public int dequeue() throws QueueEmptyException {
        // condition for being empty is 'front == rear'
        if (f == r) {
            throw new QueueEmptyException();
        }
        int item = q[f];    // we want to delete the front cell, so we need to keep front's data somewhere (in item here)
        f = (f + 1) % q.length;
        return item;
    }

    public boolean isEmpty() {
        return (f == r);
    }

    public static void main(String[] args) throws QueueEmptyException {
        Queue queue = new Queue();
        for (int i = 1; i <= 4; i++) {
            queue.enqueue(i);
        }
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(5);
        queue.enqueue(7);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

    }

}


//// test for queue in Java Visualizer
//public class CustomQueue {
//    private int queue[];  // Array to store queue elements
//    private int f, r;     // f: front index, r: rear index
//
//    // Default constructor
//    public CustomQueue() {
//        this(10); // Call the other constructor with default size 10
//    }
//
//    // Constructor with specified size
//    public CustomQueue(int size) {
//        queue = new int[size];
//        f = r = 0;  // Initialize front and rear to 0
//    }
//
//    // Method to add an item to the queue
//    public void enqueue(int item) {
//        // Check if queue is full
//        if ((r + 1) % queue.length == f) {
//            System.out.println("Queue is full!");
//            return;
//        }
//
//        queue[r] = item;  // Add item at rear
//        r = (r + 1) % queue.length;  // Move rear to next position, wrap if necessary
//    }
//
//    // Method to remove and return an item from the queue
//    public int dequeue() {
//        // Check if queue is empty
//        if (r == f) {
//            System.out.println("Queue is empty!");
//            return -1;
//        }
//
//        int item = queue[f];  // Get item at front
//        f = (f + 1) % queue.length;  // Move front to next position, wrap if necessary
//        return item;
//    }
//
//    // Check if the queue is empty
//    public boolean isEmpty() {
//        return r == f;  // Queue is empty when front and rear are at same position
//    }
//
//    // Check if the queue is full
//    public boolean isFull() {
//        return (r + 1) % queue.length == f;  // Queue is full when next rear position is front
//    }
//
//    // Calculate the current size of the queue
//    public int size() {
//        return (r - f + queue.length) % queue.length;  // Calculate size considering wrap-around
//    }
//
//    // Main method for testing
//    public static void main(String[] args) {
//        CustomQueue q = new CustomQueue(4);  // Create a queue of size 4
//        q.enqueue(6);
//        q.enqueue(7);
//        q.enqueue(8);
//
//        // Dequeue and print items
//        System.out.println("First dequeued item is: " + q.dequeue());
//        System.out.println("Second dequeued item is: " + q.dequeue());
//        System.out.println("Third dequeued item is: " + q.dequeue());
//        System.out.println("Fourth dequeued item is: " + q.dequeue());  // This will be empty
//        System.out.println("Fifth dequeued item is: " + q.dequeue());   // This will be empty too
//
//
////        First dequeued item is: 6
////        Second dequeued item is: 7
////        Third dequeued item is: 8
////        Queue is empty!
////        Fourth dequeued item is: -1
////        Queue is empty!
////        Fifth dequeued item is: -1
//    }
//}