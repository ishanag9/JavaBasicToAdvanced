package Lecture10;

public class QueueUsingArrays {

    private int[] data;
    private int front;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public QueueUsingArrays() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public QueueUsingArrays(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Invalid Capacity");
        }
        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int element) throws Exception {
        if (this.size == this.data.length) {
            throw new Exception("Queue is FULL");
        }
        //available index(ai)
        int ai = (this.front + this.size) % this.data.length;
        this.data[ai] = element;
        this.size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue id EMPTY");
        }

    }
}
