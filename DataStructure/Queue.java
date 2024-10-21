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

}
