package Lecture10;

import java.util.*;

public class Histogram {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        Histogram mainobj = new Histogram();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        System.out.println(hist(arr, stack));
    }


    public static long hist(int[] hist, StacksUsingArrays s) throws Exception {

        int n = hist.length;

        int max_area = 0; // Initialize max area
        int tp;  // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar

        int i = 0;
        while (i < n) {
            if (s.isEmpty() || hist[s.top()] <= hist[i])
                s.push(i++);
            else {
                tp = s.top();  // store the top index
                s.pop();  // pop the top

                area_with_top = hist[tp] * (s.isEmpty() ? i : i - s.top() - 1);
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        while (s.isEmpty() == false) {
            tp = s.top();
            s.pop();
            area_with_top = hist[tp] * (s.isEmpty() ? i : i - s.top() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;
    }

    private class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }

    }

}


