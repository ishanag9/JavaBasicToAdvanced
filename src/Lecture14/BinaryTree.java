// Binary Tree & its specifications

package Lecture14;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private int size;

    public BinaryTree() {
        Scanner s = new Scanner(System.in);
        this.root = this.takeInput(s, null, false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
        if (parent == null) {
            System.out.println("Enter data of root node");
        } else {
            if (isLeftOrRight) {
                System.out.println("Enter data of left node");
            } else {
                System.out.println("Enter data of right node");
            }
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;


        System.out.println("Do you have data for left node : " + data + " (true or false)");
        boolean choice = s.nextBoolean();
        if (choice) {
//            System.out.println("Enter data of left node");
            node.left = takeInput(s, node, true);
        }


        System.out.println("Do you have data for right node : " + data + " (true or false)");
        choice = s.nextBoolean();
        if (choice) {
//            System.out.println("Enter data of right node");
            node.right = takeInput(s, node, false);
        }

        return node;
    }


    public void display() {
        display(this.root);
    }


    private void display(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + " => ");
        } else {
            System.out.print("END => ");
        }

        System.out.print(node.data);

        if (node.right != null) {
            System.out.print(" <= " + node.right.data);
        } else {
            System.out.print(" <= END");
        }

        System.out.println();

        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }


    public int size2() {
        return this.size2(this.root);
    }

    private int size2(Node node) {
        if (node == null) {
            return 0;
        }

        int leftSize = this.size2(node.left);
        int rightSize = this.size2(node.right);
        int totalSize = leftSize + rightSize + 1;
        return totalSize;
    }


    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = this.max(node.left);
        int rightMax = this.max(node.right);
        int maximum = node.data;

        if (leftMax > rightMax) {
            if (leftMax > maximum) {
                maximum = leftMax;
            }
        } else {
            if (rightMax > maximum) {
                maximum = rightMax;
            }
        }
        return maximum;
    }


    public int min() {
        return this.min(this.root);
    }

    private int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = this.min(node.left);
        int rightMin = this.min(node.right);
        int minimum = node.data;
        //        int minimum = Math.min(node.data, Math.min(leftMin, rightMin));

        if (leftMin < rightMin) {
            if (leftMin < minimum) {
                minimum = leftMin;
            }
        } else {
            if (rightMin < minimum) {
                minimum = rightMin;
            }
        }
        return minimum;
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


    public boolean find(int data) {
        return this.find(data, this.root);
    }

    private boolean find(int data, Node node) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (this.find(data, node.left)) {
            return true;
        } else if (this.find(data, node.right)) {
            return true;
        } else {
            return false;
        }
    }


    public void mirror() {
        this.mirror(this.root);
    }

    public void mirror(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        this.mirror(node.left);
        this.mirror(node.right);

    }


    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }


    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public void levelOrder() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node rv = queue.remove();
            System.out.print(rv.data + " ");
            if (rv.left != null) {
                queue.add(rv.left);
            }
            if (rv.right != null) {
                queue.add(rv.right);
            }
        }
    }

    public boolean isBST() {
        return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        } else if (!isBST(node.left, min, node.data)) {
            return false;
        } else if (!isBST(node.right, node.data, max)) {
            return false;
        } else {
            return true;
        }
    }

    public int diameter() {
        return this.diameter(this.root);
    }

    private int diameter(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = this.height(node.left);
        int rightHeight = this.height(node.right);

        int leftDiameter = this.diameter(node.left);
        int rightDiameter = this.diameter(node.right);

        return Math.max(leftHeight + rightHeight + 2, Math.max(leftDiameter, rightDiameter));
    }


}
