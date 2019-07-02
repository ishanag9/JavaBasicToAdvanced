package Lecture4;

import java.util.Scanner;

public class NextSOrGNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {5, 1, 9, 2, 5, 1, 7};
        nextNumber(arr);
    }

    private static void nextNumber(int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < arr.length && k < arr.length) {
            if (arr[i] < arr[j] && arr[j] > arr[k]) {
                arr[i] = arr[k];
            } else {
                arr[i] = -1;
            }
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l]);

        }
    }
}
