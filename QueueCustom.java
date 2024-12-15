public class QueueCustom {
    private int[] queue; // Array to store queue elements
    private int front, rear; // Pointers for the front and rear of the queue

    // Default constructor that initializes the queue with size 10
    public QueueCustom() {
        this(10); // Call the parameterized constructor with default size 10
    }

    // Parameterized constructor to initialize the queue with a specific size
    public QueueCustom(int size) {
        queue = new int[size]; // Create an array of the given size to represent the queue
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
        rear = rear + 1; // Move the rear pointer to the next position
        queue[rear] = item; // Add the item to the queue at the rear position
    }

    // Method to remove and return the item from the front of the queue
    public int dequeue() {
        // Check if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty!"); // Display message if the queue is empty
            return -1; // Return -1 to indicate that the queue is empty
        }
        int item = queue[front]; // Get the item at the front of the queue
        front = front + 1; // Move the front pointer to the next position

        // If the queue becomes empty, reset front and rear to -1
        if (front > rear) {
            front = rear = -1; // Reset the pointers when the queue is empty
        }
        return item; // Return the dequeued item
    }

    // Method to return the number of elements in the queue
    public int getSize() {
        // If the queue is empty, return 0
        if (isEmpty()) {
            return 0;
        }
        // Size is the difference between rear and front + 1
        return rear - front + 1;
    }

    // Method to return the capacity of the queue
    public int getCapacity() {
        return queue.length; // The capacity is the length of the queue array
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1; // The queue is empty if front is -1
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == queue.length - 1; // The queue is full when rear is at the last index of the array
    }

    // Main method to test the functionality of the queue
    public static void main(String[] args) {
        QueueCustom q = new QueueCustom(5); // Create a queue of capacity 5
        q.enqueue(10); // Add 10 to the queue
        q.enqueue(20); // Add 20 to the queue
        q.enqueue(30); // Add 30 to the queue

        // Print the current size of the queue
        System.out.println("Queue Size: " + q.getSize()); // Output should be 3
        // Print the capacity of the queue
        System.out.println("Queue Capacity: " + q.getCapacity()); // Output should be 5
    }
}
