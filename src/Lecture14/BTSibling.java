// Given a binary tree print all nodes that don’t have a sibling

package Lecture14;

import java.util.*;

public class BTSibling {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTSibling m = new BTSibling();
        BinaryTree bt = m.new BinaryTree();
        bt.sibling();
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

        public Node takeInput(Node parent, boolean ilc) {

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

        public void sibling() {
            this.sibling(this.root);
        }

        private void sibling(Node node) {
            // write your code here

            if (node == null) {
                return;
            }

            if (node.left != null && node.right != null) {
                sibling(node.left);
                sibling(node.right);
            } else if (node.right != null) {
                System.out.print(node.right.data + " ");
                sibling(node.right);
            } else if (node.left != null) {
                System.out.print(node.left.data + " ");
                sibling(node.left);
            }

        }

    }

}

