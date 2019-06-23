package Lecture4;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        inputarr(arr,s);
        int m = s.nextInt();
        System.out.println("Index by binary search: " + binarySearch(arr, m));

    }
    private static int binarySearch(int[] arr, int data) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] > data) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }
    private static int[] inputarr(int[] arr, Scanner s) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    }

