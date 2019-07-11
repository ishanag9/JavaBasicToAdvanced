package Lecture10;

import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        System.out.println("Enter q ");
        int q = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = s.nextInt();
        }

        PWC(arr, q);


    }

    private static void PWC(int[] arr, int q) {

        for (int k = 0; k < q; k++) {


            Stack<Integer> stack = new Stack<>();
            int[] ans = new int[arr.length];

            for (int i = arr.length - 1; i >= 0; i--) {
                if (checkPrime(arr[i])) {
                    stack.push(arr[i]);
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (!checkPrime(arr[i])) {
                    stack.push(arr[i]);
                }
            }
//        for (int i = stack.size() - 1; i >= 0; i--) {
//            System.out.println(stack.get(i));
//        }

            for (int i = 0; i < ans.length; i++) {
                ans[i] = stack.get(i);
//            System.out.println(ans[i]);
            }

            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int temp = ans[start];
                ans[start] = ans[end];
                ans[end] = temp;
                start++;
                end--;
            }


            for (int i = 0; i < ans.length; i++) {
                int temp = ans[i];
                ans[i] = arr[i];
                arr[i] = temp;
//            System.out.println(arr[i]);
            }

//            if (q > 1) {
//                PWC(arr, q - 1);
//            }

            for (int i = 0; i < ans.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    private static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
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
