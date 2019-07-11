package Lecture13;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.addAt(1, 20);
        list.removeFirst();
        list.removeLast();
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.display();

        list.reverseDI();
        list.display();

        list.reversePI();
        list.display();

        System.out.println("Mid --> " + list.mid());

        System.out.println("KthNodeFromEnd --> " + list.KthNodeFromEnd(1));

        list.reverseDR();
        list.display();


    }

}
