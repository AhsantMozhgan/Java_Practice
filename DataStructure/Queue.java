package DataStructure;

class QueueFullException extends RuntimeException {

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

}
