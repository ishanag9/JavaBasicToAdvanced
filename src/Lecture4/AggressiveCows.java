package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cows = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        //        int[] arr = {1, 2, 8, 4, 9};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, cows));
    }

    private static int binarySearch(int[] arr, int cows) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (check(arr, mid, cows)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end - 1;
    }

    private static boolean check(int[] arr, int mid, int cows) {
        int cowsPlaced = 1;
        int lastPosition = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPosition < mid) {
                cowsPlaced++;
                if (cowsPlaced == cows) {
                    return true;
                }
            }
            lastPosition = arr[i];
        }
        return false;
    }
}
