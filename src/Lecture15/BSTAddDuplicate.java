// ADD DUPLICATE ( BST )
// For each node in a binary search tree,
// create a new duplicate node, and insert the duplicate as the left child of the original node.

package Lecture15;

import java.util.*;

public class BSTAddDuplicate {
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private int size;

    public BSTAddDuplicate() {
        this.root = null;
        this.size = 0;
    }

    private int size() {
        return this.size;
    }

    private boolean isEmpty() {
        return this.size() == 0;
    }

    private void add(int data) {
        this.add(data, this.root);
    }

    private void add(int data, Node node) {
        if (this.isEmpty()) {
            Node n = new Node(data, null, null);
            this.size++;
            this.root = n;
            return;
        } else {
            if (data > node.data && node.right == null) {
                Node n = new Node(data, null, null);
                this.size++;
                node.right = n;
            } else if (data < node.data && node.left == null) {
                Node n = new Node(data, null, null);
                this.size++;
                node.left = n;
            } else if (data > node.data) {
                add(data, node.right);
            } else if (data < node.data) {
                add(data, node.left);
            }
        }
    }

    private void display() {
        this.display(this.root);
    }

    private void remove(int data) {
        this.root = this.remove(this.root, data);
    }

    private Node remove(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node.left = this.remove(node.left, data);
            return node;
        } else if (data > node.data) {
            node.right = this.remove(node.right, data);
            return node;
        } else {
            if (node.left == null && node.right == null) {
                this.size--;
                return null;
            } else if (node.left == null) {
                this.size--;
                return node.right;
            } else if (node.right == null) {
                this.size--;
                return node.left;
            } else {
                int lmax = this.max(node.left);
                node.data = lmax;
                node.left = this.remove(node.left, lmax);
                return node;
            }
        }
    }

    private int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        int max = node.data;
        if (node.right != null) {
            max = this.max(node.right);
        }
        return max;
    }

    private void display(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + " => ");
        } else {
            System.out.print("END => ");
        }
        System.out.print(node.data);
        if (node.right != null) {
            System.out.print(" <= " + node.right.data);
        } else {
            System.out.print(" <= END");
        }
        System.out.println();
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    private void duplicate() {
        this.duplicate(this.root);
    }

    private void duplicate(Node node) {
        Node oldLeft;

        if (node == null)
            return;

        /* do the subtrees */
        duplicate(node.left);
        duplicate(node.right);

        /* duplicate this node to its left */
        oldLeft = node.left;
        node.left = new Node(node.data, null, null);
        node.left.left = oldLeft;
    }

    public static void main(String[] args) {
        BSTAddDuplicate bst = new BSTAddDuplicate();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            bst.add(s.nextInt());
        }
        bst.duplicate();
        bst.display();
    }
}

