// REMOVE THE LEAVES ( BINARY TREE )
//Given a binary tree, remove all the leaves from the tree

package Lecture14;

import java.util.*;

public class BTRemoveLeaves {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTRemoveLeaves m = new BTRemoveLeaves();
        BinaryTree bt = m.new BinaryTree();
        bt.removeLeaves();
        bt.display();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
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

        private void removeLeaves() {
            this.removeLeaves(this.root);
        }

        private Node removeLeaves(Node parent) {
            if (parent.left == null && parent.right == null) {
                return null;
            }
            if (parent.left != null)
                parent.left = removeLeaves(parent.left);
            if (parent.right != null)
                parent.right = removeLeaves(parent.right);

            return parent;
        }

    }
}
