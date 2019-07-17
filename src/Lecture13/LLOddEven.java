/*
LL - ODDEVEN
Given a list, modify it such that all odd elements appear before the even ones.
The order of odd elements and even shall remain intact.

Sample Input:
    5
    1 2 3 4 5

Sample Output:
    1 3 5 2 4
*/

package Lecture13;

import java.util.*;

class LLOddEven {

    private class Node {

        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }

        return fn.data;
    }

    public void partition() throws Exception {

        // Write your code here
        this.head = this.partition(this.head);
    }

    private Node partition(Node curr) throws Exception{
        Node evenHead = null;
        Node oddHead = null;
        Node evenTail = null;
        Node oddTail = null;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            curr = curr.next;
        }
        oddTail.next = evenHead;
        evenTail.next = null;
        return oddHead;

    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub


        LLOddEven ll = new LLOddEven();
        int n = scn.nextInt();

        for (int j = 0; j < n; j++) {
            int item = scn.nextInt();
            ll.addLast(item);
        }

        ll.partition();
        ll.display();


    }
}

