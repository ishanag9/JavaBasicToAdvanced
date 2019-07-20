package Lecture14;

public class BinaryTreeClient {
    public static void main(String[] args) {
        // 50 true 25 true 12 false false true 81 false false true 75 true 48 false false true 16 false false
        // 50 true 25 true 12 false false false true 75 true 62 false false false
        BinaryTree tree = new BinaryTree();
        tree.display();

        System.out.println(tree.size2());

        System.out.println(tree.max());
        System.out.println(tree.min());
        System.out.println(tree.height());
        System.out.println(tree.find(12));
        System.out.println(tree.find(16));
        System.out.println(tree.find(202));

//        tree.mirror();
//        tree.display();

        tree.preOrder();
        System.out.println();

        tree.inOrder();
        System.out.println();

        tree.postOrder();
        System.out.println();

        tree.levelOrder();
        System.out.println();

        System.out.println(tree.isBST());



        System.out.println(tree.diameter());

    }
}
