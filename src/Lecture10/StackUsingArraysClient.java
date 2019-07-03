package Lecture10;

public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception {
        StackUsingArrays stack = new StackUsingArrays(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
            displayStackInfo(stack);
        }
        stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
//        stack.pop();
        displayStackInfo(stack);
    }

    private static void displayStackInfo(StackUsingArrays stack) throws Exception{
        stack.display();
        System.out.println("TOP--> " + stack.top());
        System.out.println("Size--> " + stack.size());
        System.out.println();
    }
}
