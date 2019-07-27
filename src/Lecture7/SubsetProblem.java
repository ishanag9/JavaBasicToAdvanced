package Lecture7;

import java.util.*;

public class SubsetProblem {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int t = s.nextInt();
        PrintSS(arr, 0, t, 0);
    }

    public static void PrintSS(int[] arr, int i, int t, int count) {
        if (i == arr.length) {
            System.out.println();
            System.out.println(count);
            return;
        }
        if (i == arr.length - 1) {
            if (arr[i] == t) {
                System.out.print(arr[i]);
                count++;
            }
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == t) {
                System.out.print(arr[i] + " " + arr[j]);
                System.out.print("  ");
                count++;
            }
        }
        PrintSS(arr, i + 1, t, count);

    }
}
