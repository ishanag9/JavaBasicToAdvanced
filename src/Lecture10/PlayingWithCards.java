package Lecture10;

import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = s.nextInt();
        }
        PWC(arr,q);

    }

    private static void PWC(int[] arr,int q) {
        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            if (checkPrime(arr[i])) {
                stack1.push(arr[i]);
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (!checkPrime(arr[i])) {
                stack1.push(arr[i]);
            }
        }
        for (int i = 0; i < ans.length; i++) {
//            ans[i] = stack1.peek() - i;
            System.out.println(ans[i]);
        }



    }

    private static boolean checkPrime(int n) {
        int i = 1;
        int count = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
//            System.out.println("Prime");
            return true;
        } else {
//            System.out.println("Not prime");
            return false;
        }
    }
}
