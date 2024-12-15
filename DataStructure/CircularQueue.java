package DataStructure;
// Circular QueueCustom (Using a circular array to implement a queue)

//public class CircularQueue {
//    private int[] queue; // Array to store the queue elements
//    private int front, rear; // Pointers for the front and rear of the queue
//
//    // Default constructor with a default size of 6
//    public CircularQueue() {
//        this(6); // Calls the parameterized constructor with size 6
//    }
//
//    // Parameterized constructor to initialize the queue with a given size
//    public CircularQueue(int size) {
//        queue = new int[size]; // Create an array of the specified size for the queue
//        front = -1; // Set front to -1 indicating the queue is empty
//        rear = -1;  // Set rear to -1 indicating the queue is empty
//    }
//
//    // Method to add an item to the queue
//    public void enqueue(int item) {
//        // Check if the queue is full
//        if (isFull()) {
//            System.out.println("Queue is full!"); // Display message if the queue is full
//            return; // Exit the method if the queue is full
//        }
//        // Initialize front to 0 when adding the first item
//        if (front == -1) {
//            front = 0; // Front should point to the first element of the queue
//        }
//        // Use modulo to increment rear circularly
//        rear = (rear + 1) % queue.length; // Circular increment of rear
//        queue[rear] = item; // Add the item to the queue at the rear position
//    }
//
//    // Method to remove and return the item from the front of the queue
//    public int dequeue() {
//        // Check if the queue is empty
//        if (isEmpty()) {
//            System.out.println("Queue is empty!"); // Display message if the queue is empty
//            return -1; // Return -1 to indicate the queue is empty
//        }
//        int item = queue[front]; // Get the item at the front of the queue
//        // If the queue becomes empty after dequeue, reset front and rear
//        if (front == rear) {
//            front = rear = -1; // Reset if the queue is empty
//        } else {
//            // Use modulo to increment front circularly
//            front = (front + 1) % queue.length; // Circular increment of front
//        }
//        return item; // Return the dequeued item
//    }
//
//    // Method to return the number of elements in the queue
//    public int getSize() {
//        // If the queue is empty, return 0
//        if (isEmpty()) {
//            return 0;
//        }
//        // Regular case: rear >= front
//        if (rear >= front) {
//            return rear - front + 1; // Size is the difference between rear and front + 1
//        } else {
//            // Wrap around case: when rear is before front in a circular queue
//            return queue.length - front + rear + 1; // Size considering the wrap-around
//        }
//    }
//
//    // Method to return the capacity of the queue (size of the array)
//    public int getCapacity() {
//        return queue.length; // Capacity is the length of the array
//    }
//
//    // Method to check if the queue is empty
//    public boolean isEmpty() {
//        return front == -1; // The queue is empty if front is -1
//    }
//
//    // Method to check if the queue is full
//    public boolean isFull() {
//        // The queue is full when the next rear position equals front
//        return (rear + 1) % queue.length == front; // Circular full condition
//    }
//
//    // Main method to test the functionality of the circular queue
//    public static void main(String[] args) {
//        CircularQueue q = new CircularQueue(5); // Create a queue with capacity 5
//        q.enqueue(10); // Add 10 to the queue
//        q.enqueue(20); // Add 20 to the queue
//        q.enqueue(30); // Add 30 to the queue
//
//        // Print the current size of the queue
//        System.out.println("Queue Size: " + q.getSize()); // Output should be 3
//        // Print the capacity of the queue
//        System.out.println("Queue Capacity: " + q.getCapacity()); // Output should be 5
//
//        // Perform a dequeue operation
//        q.dequeue(); // Removes 10 from the queue
//        // Print the size of the queue after the dequeue operation
//        System.out.println("Queue Size after dequeue: " + q.getSize()); // Output should be 2
//    }
//}



 // Initialize front and rear pointer to the first index (front = 0; rear = 0;)
public class CircularQueue {
    private int[] queue; // Array to store the elements of the queue
    private int front, rear; // Pointers to track the front and rear of the queue
    private boolean isEmpty; // Flag to track whether the queue is empty

    // Constructor to initialize the queue with a given size
    public CircularQueue(int size) {
        queue = new int[size]; // Create an array of the specified size
        front = 0; // Initialize front pointer to the first index
        rear = 0; // Initialize rear pointer to the first index
        isEmpty = true; // use a separate flag (boolean isEmpty) to explicitly track whether the queue is empty
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return isEmpty; // Return the value of the isEmpty flag
    }

     // Or, alternatively, The queue is empty when front == rear and no elements have been added yet.

//     public boolean isEmpty() {
//         return front == rear && queue[front] == 0; // Assuming 0 indicates no value has been enqueued
//     }


     // Method to check if the queue is full
    public boolean isFull() {
        // The queue is full if incrementing rear would make it equal to front
        return (rear + 1) % queue.length == front;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        if (isFull()) { // Check if the queue is full
            System.out.println("Queue is full!"); // Print a message if full
            return; // Exit the method
        }
        queue[rear] = item; // Add the item at the rear of the queue
        rear = (rear + 1) % queue.length; // Move the rear pointer circularly
        isEmpty = false; // Mark the queue as not empty
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty!"); // Print a message if empty
            return -1; // Return -1 to indicate failure
        }
        int item = queue[front]; // Retrieve the item at the front of the queue
        front = (front + 1) % queue.length; // Move the front pointer circularly
        if (front == rear) { // Check if the queue is now empty
            isEmpty = true; // Mark the queue as empty
        }
        return item; // Return the dequeued item
    }

    // Method to get the number of elements in the queue
    public int getSize() {
        if (rear >= front) { // If rear is ahead or equal to front in the array
            return rear - front; // Size is the difference between rear and front
        } else { // If rear has wrapped around
            return queue.length - front + rear; // Calculate size with wrapping
        }
    }

    // Method to get the capacity of the queue
    public int getCapacity() {
        return queue.length; // Capacity is the total size of the array
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


