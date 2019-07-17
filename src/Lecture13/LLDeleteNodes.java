/*
DELETE NODES
Given a singly linked list delete all nodes which are having a greater value
among any of the nodes residing on the right side.

Sample Input:
    8
    12 15 10 11 5 6 2 3

Sample Output:
    15 11 6 3
*/

package Lecture13;

import java.util.Scanner;

public class LLDeleteNodes {
    private class Node {
        int data;
        Node next;

        //        Constructor
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;

    public LLDeleteNodes() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data, this.head);
        this.head = node;
        if (this.isEmpty()) {
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    private Node getNodeAt(int index) throws Exception {
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid Index");
        }
        int counter = 0;
        Node temp = this.head;
        while (counter < index) {
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void addAt(int index, int data) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("Invalid Index");
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == this.size) {
            addLast(data);
        } else {
            Node temp = this.getNodeAt(index - 1);
            Node node = new Node(data, temp.next);
            temp.next = node;
            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is EMPTY");
        }
        return this.head.data;
    }

    private int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is EMPTY");
        }
        return this.tail.data;
    }

    public int getAt(int index) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is EMPTY");
        }
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid Index");
        }
        Node temp = getNodeAt(index);
        return temp.data;
    }

    public int removeFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is EMPTY");
        }
        int rv = this.head.data;
        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return rv;
    }

    public int removeLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is EMPTY");
        }
        int rv = this.head.data;
        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node temp = this.getNodeAt(this.size - 2);
            this.tail = temp;
            this.tail.next = null;
        }
        this.size--;
        return rv;
    }

    public int removeAt(int index) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid Index");
        }
        if (index == 0) {
            return this.removeFirst();
        } else if (index == this.size - 1) {
            return this.removeLast();
        } else {
            Node temp = this.getNodeAt(index - 1);
            int rv = temp.next.data;
            temp.next = temp.next.next;
            this.size--;
            return rv;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverseList()
    {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void deleteNodes() throws Exception {
        reverseList();
        this._deleteNodes();
        reverseList();
    }

    private void _deleteNodes() throws Exception {
        Node curr = this.head;
        Node maxNode = this.head;
        Node temp;

        while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                temp = curr.next;
                curr.next = temp.next;
                temp = null;
            } else {
                curr = curr.next;
                maxNode = curr;
            }


        }
    }

    public static void main(String[] args) throws Exception {
        LLDeleteNodes list = new LLDeleteNodes();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int j = s.nextInt();
            list.addLast(j);
        }
        list.deleteNodes();
        list.display();
    }

}


