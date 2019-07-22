package Lecture14;

import java.util.*;

public class BTLCA {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTLCA m = new BTLCA();
        BinaryTree bt = m.new BinaryTree();
        int d1 = scn.nextInt();
        int d2 = scn.nextInt();
        System.out.println(bt.lca(d1, d2));
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

        public int lca(int d1, int d2) {
            Node result = lca(this.root, d1, d2);
            return result.data;
        }

        private Node lca(Node node, int d1, int d2) {
            if (node == null || node.data == d1 || node.data == d2) {
                return node;
            }

            Node leftResult = lca(node.left, d1, d2);
            Node rightResult = lca(node.right, d1, d2);

            if (leftResult == null) {
                return rightResult;
            } else if (rightResult == null) {
                return leftResult;
            } else {
                return node;
            }
        }

    }

}


