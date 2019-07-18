/*
Given a singly linked list: A0→A1→…→An-1→An, reorder it to: A0→An→A1→An-1→A2→An-2→…

It is recommended do this in-place without altering the nodes' values.

Sample Input:
    2
    3
    1 2 3
    4
    1 7 3 4
Sample Output:
    1 3 2
    1 4 7 3
*/

package Lecture13;

import java.util.*;

public class LLFold {
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

    public LLFold() {
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

//    void reverseList() {
//        Node current = head;
//        Node prev = null;
//        Node next;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }

    public Node mid() {
        return this.mid(this.head);
    }

    private Node mid(Node node) {
        Node slow = node;
        Node fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseList(Node node) {
        Node curr = node;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public void foldOrRearrange(Node node) {
        Node slow = mid();
        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;

        node2 = reverseList(node2);

        node = new Node(0, null);
        Node curr = node;

        while (node1 != null || node2 != null) {

            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }
        node = node.next;
    }

    public static void main(String[] args) throws Exception {
        LLFold list = new LLFold();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                int j = s.nextInt();
                list.addLast(j);
            }
            list.foldOrRearrange(list.head);
            list.display();
            list = new LLFold();
            t--;
        }
    }

}


