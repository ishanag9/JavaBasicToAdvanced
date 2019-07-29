// TREE BOTTOM VIEW
//Given a binary tree , print the nodes in left to right manner as visible from below the tree

package Lecture14;

import java.util.*;

public class BTBottomView {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 10000000; i++) {
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
        BTBottomView m = new BTBottomView();
        BinaryTree bt = m.new BinaryTree(arr);

        bt.Topview();

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

        private Node root;
        private int size;

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
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

        private void Topview() {
            this.topview(this.root.left);
            this.Topview(this.root.right);
        }

        private void topview(Node node) {
            if (node == null || node.data == -1) {
                return;
            }

            topview(node.left);
            System.out.print(node.data + " ");
        }

        private void Topview(Node node) {
            if (node == null || node.data == -1) {
                return;
            }

            topview(node.left);
            System.out.print(node.data + " ");
        }

    }
}
