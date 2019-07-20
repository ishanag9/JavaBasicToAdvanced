package Lecture14;

import java.util.*;

public class BTStructurallyIdentical {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTStructurallyIdentical m = new BTStructurallyIdentical();
        BinaryTree bt1 = m.new BinaryTree();
        BinaryTree bt2 = m.new BinaryTree();
        System.out.println(bt1.structurallyIdentical(bt2));
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

        public boolean structurallyIdentical(BinaryTree other) {
            return this.structurallyIdentical(this.root, other.root);
        }

        private boolean structurallyIdentical(Node tnode, Node onode) {
            // write your code here
            if (tnode == null && onode == null) {
                return true;
            }

            if (tnode != null && onode != null) {
//             if we have to compare data also then return this
//                return (tnode.data == onode.data
//                        && structurallyIdentical(tnode.left, onode.left)
//                        && structurallyIdentical(tnode.right, onode.right));

//                else return
                return (structurallyIdentical(tnode.left, onode.left)
                        && structurallyIdentical(tnode.right, onode.right));
            }
            return false;
        }

    }
}
