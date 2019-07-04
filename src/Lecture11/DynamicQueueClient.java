package Lecture11;

import Lecture10.QueueUsingArrays;

public class DynamicQueueClient {
    public static void main(String[] args) throws Exception {

        QueueUsingArrays queue = new DynamicQueue(5);

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
            displayQueueinfo(queue);
        }
        while (!queue.isEmpty()) {
            displayQueueinfo(queue);
            queue.dequeue();
        }
    }


    public static void displayQueueinfo(QueueUsingArrays queue) throws Exception {
        System.out.println("***********************");
        queue.display();
        System.out.println("Front=" + queue.front());
        System.out.println("Size=" + queue.size());
        System.out.println("***********************");
    }
}
