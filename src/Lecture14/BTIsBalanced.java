// Given a Binary tree check if it is balanced
// i.e. depth of the left and right sub-trees of every node differ by 1 or less.

package Lecture14;

import java.util.*;

public class BTIsBalanced {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTIsBalanced m = new BTIsBalanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        int height(Node node) {
            /* base case tree is empty */
            if (node == null)
                return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
            return 1 + Math.max(height(node.left), height(node.right));
        }

        public boolean isBalanced() {
            return this.isBalanced(this.root);
        }

        private boolean isBalanced(Node node) {
            // write your code here
            int lh;
            int rh;
            if (node == null) {
                return true;
            }

            lh = height(node.left);
            rh = height(node.right);

            if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
                return true;
            }
            return false;
        }

    }
}
