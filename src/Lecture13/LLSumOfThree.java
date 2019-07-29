// TRIPLET FROM THREE LINKED LISTS

// Given three linked lists, say a, b and c, find one node from each list such that the sum of the
// values of the nodes is equal to a given number say, Target.
// As any number of answers can be possible return the first one you get while traversing.

package Lecture13;

import java.util.*;

public class LLSumOfThree {
    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    int size1, size2, size3;
    Node head1, head2, head3;
    Node tail1, tail2, tail3;

    private int size(int list) {
        if (list == 1) {
            return this.size1;
        } else if (list == 2) {
            return this.size2;
        } else if (list == 3) {
            return this.size3;
        } else {
            return -1;
        }
    }

    private boolean isEmpty(int list) {
        return this.size(list) == 0;
    }

    private void addLast(int data, int list) {
        Node node = new Node(data, null);
        if (list == 1) {
            if (this.isEmpty(1)) {
                this.head1 = node;
                this.tail1 = node;
            } else {
                this.tail1.next = node;
                this.tail1 = node;
            }
            this.size1++;
        }
        if (list == 2) {
            if (this.isEmpty(2)) {
                this.head2 = node;
                this.tail2 = node;
            } else {
                this.tail2.next = node;
                this.tail2 = node;
            }
            this.size2++;
        }
        if (list == 3) {
            if (this.isEmpty(3)) {
                this.head3 = node;
                this.tail3 = node;
            } else {
                this.tail3.next = node;
                this.tail3 = node;
            }
            this.size3++;
        }
    }

    private Node getNodeAt(int index, int list) throws Exception {
        int counter = 0;
        Node temp = null;
        if (list == 1) {
            if (index < 0 || index >= this.size1) {
                throw new Exception("Invalid index");
            }
            temp = this.head1;
        }
        if (list == 2) {
            if (index < 0 || index >= this.size2) {
                throw new Exception("Invalid index");
            }
            temp = this.head2;
        }
        if (list == 3) {
            if (index < 0 || index >= this.size3) {
                throw new Exception("Invalid index");
            }
            temp = this.head3;
        }
        while (counter < index) {
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    private void sum(int target) throws Exception {
        Node head11 = this.head1;
        Node head12 = this.head2;
        Node head13 = this.head3;

        for (int i = 0; i < this.size1; i++) {
            for (int j = 0; j < this.size2; j++) {
                for (int k = 0; k < this.size3; k++) {
                    if (head11.data + head12.data + head13.data == target) {
                        System.out.print(head11.data + " ");
                        System.out.print(head12.data + " ");
                        System.out.print(head13.data + "");
                        return;
                    }
                    head13 = head13.next;
                }
                head13 = getNodeAt(0, 3);
                head12 = head12.next;
            }
            head12 = getNodeAt(0, 2);
            head11 = head11.next;
        }
    }

    private void display(int list) {
        Node temp = null;
        if (list == 1) {
            temp = this.head1;
        }
        if (list == 2) {
            temp = this.head2;
        }
        if (list == 3) {
            temp = this.head3;
        }
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        LLSumOfThree list1 = new LLSumOfThree();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        for (int i = 0; i < n; i++) {
            list1.addLast(s.nextInt(), 1);
        }
        for (int i = 0; i < m; i++) {
            list1.addLast(s.nextInt(), 2);
        }
        for (int i = 0; i < k; i++) {
            list1.addLast(s.nextInt(), 3);
        }
        int target = s.nextInt();
        list1.sum(target);
        //list1.display(3);
    }

}
