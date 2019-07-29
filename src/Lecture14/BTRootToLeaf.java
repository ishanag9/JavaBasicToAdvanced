// ROOT TO LEAF ( BINARY TREE)
//Given a binary tree and a number k,
// print out all root to leaf paths where the sum of all nodes value is same as the given number.

package Lecture14;

import java.util.*;

public class BTRootToLeaf {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTRootToLeaf m = new BTRootToLeaf();
        BinaryTree bt = m.new BinaryTree();
        int k = scn.nextInt();
        bt.roottoleaf(k);
        // bt.display();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        private BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        private Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
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

        private void roottoleaf(int k) {
            roottoleaf(k, this.root, "", 0);
        }

        private void roottoleaf(int k, Node node, String osf, int temp) {
            if (node == null) {
                return;
            }
            osf = osf + node.data + " ";
            temp = temp + node.data;
            if (node.left == null && node.right == null) {
                if (temp == k) {
                    System.out.println(osf);
                    temp = 0;
                }
                return;
            }

            roottoleaf(k, node.left, osf, temp);
            roottoleaf(k, node.right, osf, temp);

        }

    }

}




