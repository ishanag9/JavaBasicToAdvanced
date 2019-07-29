// SUM OF TWO LINKED LISTS
// Given two numbers represented by two linked lists, write a program that prints the sum list.
// The sum list is linked list representation of addition of two input numbers in linked lists.
// It is not allowed to modify the lists. Also, not allowed to use explicit extra space (Use Recursion).

package Lecture13;

import java.util.*;

public class LLSum {
    private class node {
        int data;
        node next;

        node(int data) {
            this.data = data;

        }
    }

    void printlist(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    node head1, head2, result;
    int carry;

    /* A utility function to push a value to linked list */
    void push(int data, int list) {
        node newnode = new node(data);
        if (list == 1) {
            newnode.next = head1;
            head1 = newnode;
        } else if (list == 2) {
            newnode.next = head2;
            head2 = newnode;
        } else {
            newnode.next = result;
            result = newnode;
        }

    }

    // Adds two linked lists of same size represented by
    // head1 and head2 and returns head of the resultant
    // linked list. Carry is propagated while returning
    // from the recursion
    void addsamesize(node n, node m) {
        // Since the function assumes linked lists are of
        // same size, check any of the two head pointers
        if (n == null)
            return;

        // Recursively add remaining nodes and get the carry
        addsamesize(n.next, m.next);

        // add digits of current nodes and propagated carry
        int sum = n.data + m.data + carry;
        carry = sum / 10;
        sum = sum % 10;

        // Push this to result list
        push(sum, 3);

    }

    node cur;

    // This function is called after the smaller list is
    // added to the bigger lists's sublist of same size.
    // Once the right sublist is added, the carry must be
    // added to the left side of larger list to get the
    // final result.
    void propogatecarry(node head1) {
        // If diff. number of nodes are not traversed, add carry
        if (head1 != cur) {
            propogatecarry(head1.next);
            int sum = carry + head1.data;
            carry = sum / 10;
            sum %= 10;

            // add this node to the front of the result
            push(sum, 3);
        }
    }

    int getsize(node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // The main function that adds two linked lists
    // represented by head1 and head2. The sum of two
    // lists is stored in a list referred by result
    void addlists() {
        // first list is empty
        if (head1 == null) {
            result = head2;
            return;
        }

        // first list is empty
        if (head2 == null) {
            result = head1;
            return;
        }

        int size1 = getsize(head1);
        int size2 = getsize(head2);

        // Add same size lists
        if (size1 == size2) {
            addsamesize(head1, head2);
        } else {
            // First list should always be larger than second list.
            // If not, swap pointers
            if (size1 < size2) {
                node temp = head1;
                head1 = head2;
                head2 = temp;
            }
            int diff = Math.abs(size1 - size2);

            // move diff. number of nodes in first list
            node temp = head1;
            while (diff-- >= 0) {
                cur = temp;
                temp = temp.next;
            }

            // get addition of same size lists
            addsamesize(cur, head2);

            // get addition of remaining first list and carry
            propogatecarry(head1);
        }
        // if some carry is still there, add a new node to
        // the front of the result list. e.g. 999 and 87
        if (carry > 0)
            push(carry, 3);

    }

    // Driver program to test above functions
    public static void main(String args[]) {
        LLSum list = new LLSum();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }

        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);


        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);

        list.addlists();

        list.printlist(list.result);
    }
}
