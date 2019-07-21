// Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left
//  and so on. This means odd levels should get printed from left to right and even levels
//      should be printed from right to left.
//          Each level should be printed at a new line.

package Lecture14;

import java.util.*;

public class BTLevelOrderZigZag {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BTLevelOrderZigZag m = new BTLevelOrderZigZag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
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

        public void levelOrderZZ() {

            // write your code here

            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();

            stack1.push(this.root);

            boolean leftToRight = true;

            while (!stack1.isEmpty()) {
                Node node = stack1.pop();

                System.out.print(node.data + " ");

                if (leftToRight) {
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                } else {
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                }

                if (stack1.isEmpty()) {
                    leftToRight = !leftToRight;
                    Stack<Node> temp = stack1;
                    stack1 = stack2;
                    stack2 = temp;
                }
            }

        }


        public int height() {
            return this.height(this.root);
        }

        private int height(Node node) {
            if (node == null) {
                return -1;
            }

            int leftHeight = this.height(node.left);
            int rightHeight = this.height(node.right);
            int totalHeight;
            if (leftHeight > rightHeight) {
                totalHeight = leftHeight + 1;
            } else {
                totalHeight = rightHeight + 1;
            }
            return totalHeight;
        }

    }

}

