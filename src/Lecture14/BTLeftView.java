// TREE LEFT VIEW
//Given a binary tree , print its nodes from root to bottom as visible from left side of tree

package Lecture14;

import java.util.*;

public class BTLeftView {

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
        BTLeftView m = new BTLeftView();
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


        private void Topview() {
            this.topview(this.root);
        }

        private void topview(Node node) {
            if (node == null || node.data == -1) {
                return;
            }
            System.out.print(node.data + " ");
            topview(node.left);
        }
    }
}
