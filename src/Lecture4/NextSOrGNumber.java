// Given array of integer, find the next smaller of next greater element of every element in array.

//  Sample Input:
//  1
//  7
//  5 1 9 2 5 1 7

//  Sample Output:
//  2 2 -1 1 -1 -1 -1

package Lecture4;

import java.util.Scanner;

public class NextSOrGNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            arr = inputArr(arr, s);
            t--;
            for (int i = 0; i < arr.length; i++) {
                int greaterIndex = nextGNumber(arr, i);
                int smaller = nextSnumber(arr, greaterIndex);
                System.out.print(smaller + " ");
            }
        }
//        int[] arr = {5, 1, 9, 2, 5, 1, 7};

    }

    private static int[] inputArr(int[] arr, Scanner s) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = s.nextInt();
        }
        return arr;
    }

    private static int nextSnumber(int[] arr, int greaterIndex) {
        if (greaterIndex == -1) {
            return -1;
        }
        for (int i = greaterIndex; i <= greaterIndex; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[greaterIndex] > arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

    private static int nextGNumber(int[] arr, int index) {
        for (int i = index; i <= index; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    return j;
                }
            }
        }
        return -1;
    }
}
