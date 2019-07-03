// You are given number of pages in n different books and m students.
// The books are arranged in ascending order of number of pages.
// Every student is assigned to read some consecutive books.
// The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t>0) {
            int n = s.nextInt();
            int kStudents = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(binarySearch(arr, kStudents));
            t--;
        }
    }

    private static int binarySearch(int[] arr, int kStudents) {
        int totalPages = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPages += arr[i];
            start = Math.max(start, arr[i]);
        }
        int end = totalPages;
        int finalAns = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (check(arr, mid, kStudents)) {
                finalAns = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return finalAns;
    }

    private static boolean check(int[] arr, int mid, int kStudents) {
        int students = 1;
        int currentPages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentPages + arr[i] > mid) {
                currentPages = arr[i];
                students++;
                if (students > kStudents) {
                    return false;
                }
            } else {
                currentPages += arr[i];
            }
        }
        return true;
    }
}
