package Lecture10;

public class StackUsingArrays {

    private int[] data;
    private int tos;

    private static final int DEFAULT_CAPACITY = 10;

    public StackUsingArrays() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public StackUsingArrays(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Invalid Capacity");
        }
        this.data = new int[capacity];
        this.tos = -1;
    }

    public int size() {
        return this.tos + 1;
    }

    public boolean isEmpty() {
        //this.size == 0
        //this.tos == -1
        if (this.tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) throws Exception {
        if (this.size() == this.data.length) {
            throw new Exception("Stack is FULL");
        }
        this.tos++;
        this.data[this.tos] = element;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is EMPTY");
        }
        //remove value(rv)
        int rv = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return rv;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is EMPTY");
        }
        return this.data[this.tos];
    }

    public void display() {
        for (int i = this.tos; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
