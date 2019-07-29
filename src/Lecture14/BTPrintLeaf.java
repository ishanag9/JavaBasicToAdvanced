// BINARY TREES -- PRINT ALL LEAF NODES
//Given a Binary Tree Print all the leaf nodes.

package Lecture14;

import java.util.*;

public class BTPrintLeaf {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 1000; i++) {
            int temp = scn.nextInt();
            if (temp != -1)
                count++;

            arr.add(temp);
            if (temp == -1) {
                count1++;
            }
            if (count1 == count + 1) {
                break;
            }
        }

        BTPrintLeaf m = new BTPrintLeaf();
        BinaryTree bt = m.new BinaryTree(arr);
        bt.removeLeaves();
        //bt.display();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public Node root;
        public int size;

        private BinaryTree(ArrayList<Integer> arr) {
            this.root = this.takeInput(arr, this.root, 0);
        }

        private Node takeInput(ArrayList<Integer> arr, Node root, int i) {
// Base case for recursion
            if (i < arr.size()) {
                Node temp = new Node(arr.get(i));
                root = temp;

// insert left child
                root.left = takeInput(arr, root.left, 2 * i + 1);

// insert right child
                root.right = takeInput(arr, root.right, 2 * i + 2);
            }
            return root;
        }

        private void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node.data == -1) {
                return;
            }

            String str = "";

            if (node.left.data != -1) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right.data != -1) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

        private void removeLeaves() {
            this.removeLeaves(this.root);
        }

        private void removeLeaves(Node parent) {
            if (parent.left.data == -1 && parent.right.data == -1) {
                System.out.print(parent.data + " ");
                return;
            }
            if (parent.left.data != -1)
                removeLeaves(parent.left);
            if (parent.right.data != -1)
                removeLeaves(parent.right);

        }

    }
}
