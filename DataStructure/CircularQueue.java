package DataStructure;
// Circular QueueCustom (Using a circular array to implement a queue)

public class CircularQueue {
    private int[] queue; // Array to store the queue elements
    private int front, rear; // Pointers for the front and rear of the queue

    // Default constructor with a default size of 6
    public CircularQueue() {
        this(6); // Calls the parameterized constructor with size 6
    }

    // Parameterized constructor to initialize the queue with a given size
    public CircularQueue(int size) {
        queue = new int[size]; // Create an array of the specified size for the queue
        front = -1; // Set front to -1 indicating the queue is empty
        rear = -1;  // Set rear to -1 indicating the queue is empty
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        // Check if the queue is full
        if (isFull()) {
            System.out.println("Queue is full!"); // Display message if the queue is full
            return; // Exit the method if the queue is full
        }
        // Initialize front to 0 when adding the first item
        if (front == -1) {
            front = 0; // Front should point to the first element of the queue
        }
        // Use modulo to increment rear circularly
        rear = (rear + 1) % queue.length; // Circular increment of rear
        queue[rear] = item; // Add the item to the queue at the rear position
    }

    // Method to remove and return the item from the front of the queue
    public int dequeue() {
        // Check if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty!"); // Display message if the queue is empty
            return -1; // Return -1 to indicate the queue is empty
        }
        int item = queue[front]; // Get the item at the front of the queue
        // If the queue becomes empty after dequeue, reset front and rear
        if (front == rear) {
            front = rear = -1; // Reset if the queue is empty
        } else {
            // Use modulo to increment front circularly
            front = (front + 1) % queue.length; // Circular increment of front
        }
        return item; // Return the dequeued item
    }

    // Method to return the number of elements in the queue
    public int getSize() {
        // If the queue is empty, return 0
        if (isEmpty()) {
            return 0;
        }
        // Regular case: rear >= front
        if (rear >= front) {
            return rear - front + 1; // Size is the difference between rear and front + 1
        } else {
            // Wrap around case: when rear is before front in a circular queue
            return queue.length - front + rear + 1; // Size considering the wrap-around
        }
    }

    // Method to return the capacity of the queue (size of the array)
    public int getCapacity() {
        return queue.length; // Capacity is the length of the array
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1; // The queue is empty if front is -1
    }

    // Method to check if the queue is full
    public boolean isFull() {
        // The queue is full when the next rear position equals front
        return (rear + 1) % queue.length == front; // Circular full condition
    }

    // Main method to test the functionality of the circular queue
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5); // Create a queue with capacity 5
        q.enqueue(10); // Add 10 to the queue
        q.enqueue(20); // Add 20 to the queue
        q.enqueue(30); // Add 30 to the queue

        // Print the current size of the queue
        System.out.println("Queue Size: " + q.getSize()); // Output should be 3
        // Print the capacity of the queue
        System.out.println("Queue Capacity: " + q.getCapacity()); // Output should be 5

        // Perform a dequeue operation
        q.dequeue(); // Removes 10 from the queue
        // Print the size of the queue after the dequeue operation
        System.out.println("Queue Size after dequeue: " + q.getSize()); // Output should be 2
    }
}
