package Lecture15;

public class BST {
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

    public void add(int data) {
        if (this.root == null) {
            this.root = new Node(data, null, null);
            this.size++;
        } else {
            add(data, this.root);
        }
    }

    private void add(int data, Node node) {
        if (data < node.data) {
            if (node.left != null) {
                add(data, node.left);
            } else {
                node.left = new Node(data, null, null);
                this.size++;
            }
        } else if (data > node.data) {
            if (node.right != null) {
                add(data, node.right);
            } else {
                node.right = new Node(data, null, null);
                this.size++;
            }
        }
    }


    public void display() {
        this.display(this.root);
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

    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        int max = node.data;
        if (node.right != null) {
            max = this.max(node.right);
        }
        return max;
    }

    public int min() {
        return this.min(this.root);
    }

    private int min(Node node) {
        int min = node.data;
        if (node.left != null) {
            min = this.min(node.left);
        }
        return min;
    }

    public void remove(int data) {
        this.root = this.remove(this.root, data);
    }

    private Node remove(Node node, int data) {
        if (this.root == null) {
            return null;
        }
        if (data > node.data) {
            node.right = this.remove(node.right, data);
            return node;
        } else if (data < node.data) {
            node.left = this.remove(node.left, data);
            return node;
        } else {
            if (node.right == null && node.left == null) {
                this.size--;
                return null;
            } else if (node.left == null) {
                this.size--;
                return node.right;
            } else if (node.right == null) {
                this.size--;
                return node.left;
            } else {
                int leftMax = this.max(node.left);
                node.data = leftMax;
                node.left = this.remove(node.left, leftMax);
                return node;
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
/*    public int height() {
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
    }*/

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return (1 + Math.max(height(node.left), height(node.right)));
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
//        int myDiameter = leftHeight + rightHeight + 2;
        int leftDiameter = this.diameter(node.left);
        int rightDiameter = this.diameter(node.right);

        return Math.max(leftHeight + rightHeight + 2, Math.max(leftDiameter, rightDiameter));
    }

    public void printRootToLeaf() {
        this.printRootToLeaf(this.root,"");

    }

    private void printRootToLeaf(Node node, String str) {
        if (node == null) {
            return;
        }
        str = str + node.data + ", ";
        if (node.left == null && node.right == null) {
            System.out.println(str + "END");
            return;
        }
        printRootToLeaf(node.left, str);
        printRootToLeaf(node.right, str);
    }

}
