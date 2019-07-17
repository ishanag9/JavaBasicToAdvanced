package Lecture15;

public class BSTClient {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(12);
        tree.add(37);
        tree.add(62);
        tree.add(87);
        tree.add(30);
        tree.add(72);
        tree.display();

        System.out.println(tree.max());
        System.out.println(tree.min());

//        tree.remove(30);
//        tree.remove(37);
//        tree.remove(62);
//        tree.remove(50);
//        tree.display();

        System.out.println(tree.isBST());

        System.out.println(tree.height());

        System.out.println(tree.diameter());

        tree.printRootToLeaf();
    }
}
