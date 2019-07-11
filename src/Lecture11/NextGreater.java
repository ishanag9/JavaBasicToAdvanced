package Lecture11;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            nextGreater(arr);
            t--;
        }
    }

    private static void nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                int element = stack.pop();
                System.out.println(element + "," + arr[i]);
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println(element + "," + -1);
        }
    }
}
