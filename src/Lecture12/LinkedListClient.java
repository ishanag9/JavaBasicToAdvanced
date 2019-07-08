package Lecture12;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.addAt(1,20);
        list.removeFirst();
        list.removeLast();
        list.addFirst(10);
        list.addLast(40);
        list.display();

        list.reverseDI();
        list.display();

        list.reversePI();
        list.display();
    }

}
