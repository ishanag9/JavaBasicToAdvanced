// Given a binary tree. Print the level order traversal, make sure each level start at a new line.

package Lecture14;

import java.util.*;

public class BTLevelOrderNewLine {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTLevelOrderNewLine m = new BTLevelOrderNewLine();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderNewLine();
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

        public void levelOrderNewLine() {

            // write your code here

            LinkedList<Node> queue = new LinkedList<>();
            queue.add(this.root);

            while (true) {

                int nodeCount = queue.size();
                if (nodeCount == 0) {
                    break;
                }

                while (nodeCount > 0) {
                    Node node = queue.peek();
                    System.out.print(node.data + " ");
                    Node rv = queue.remove();

                    if (rv.left != null) {
                        queue.add(rv.left);
                    }

                    if (rv.right != null) {
                        queue.add(rv.right);
                    }
                    nodeCount--;
                }
                System.out.println();
            }

        }

    }

}
