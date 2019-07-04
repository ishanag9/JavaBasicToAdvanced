package Lecture4;

import java.util.Scanner;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int kPainters = s.nextInt();
        int nBoards = s.nextInt();
        int[] arr = new int[nBoards];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(binarySearch(arr, kPainters));
    }

    private static int binarySearch(int[] arr, int kPainters) {
        int totalBoards = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            totalBoards += arr[i];
            start = Math.max(start, arr[i]);
        }
        int end = totalBoards;
        int finalAns = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (check(arr, mid, kPainters)) {
                finalAns = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return finalAns;
    }

    private static boolean check(int[] arr, int mid, int kPainters) {
        int painters = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                sum = arr[i];
                painters++;
                if (painters > kPainters) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }
        if (sum == 0) {
            painters++;
            if (painters > kPainters) {
                return false;
            }
        }
        return true;
    }
}
