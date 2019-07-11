package Lecture13;

import Lecture11.DynamicStack;
import Lecture11.Questions;

public class QUSEnqueueEfficient {
    private DynamicStack pStack;
    private DynamicStack sStack;

    public QUSEnqueueEfficient() throws Exception {
        this.pStack = new DynamicStack();
        this.sStack = new DynamicStack();
    }

    public int size() {
        return pStack.size();
    }

    public boolean isEmpty() {
        return pStack.isEmpty();
    }

    public void enqueue(int element) throws Exception {
        pStack.push(element);
    }

    public int dequeue() throws Exception {
        while (pStack.size() != 1) {
            int element = pStack.pop();
            sStack.push(element);
        }
        int element = pStack.pop();
        while (sStack.size() > 0) {
            int SSElements = sStack.pop();
            pStack.push(SSElements);
        }
        return element;
    }

    public int front() throws Exception {
        while (pStack.size() != 1) {
            int element = pStack.pop();
            sStack.push(element);
        }
        int element = pStack.top();
        while (sStack.size() > 0) {
            int SSElements = sStack.pop();
            pStack.push(SSElements);
        }
        return element;
    }

    public void display() throws Exception {
        Questions.reverseStack(pStack, sStack, 0);
        pStack.display();
        Questions.reverseStack(pStack, sStack, 0);
    }

}
