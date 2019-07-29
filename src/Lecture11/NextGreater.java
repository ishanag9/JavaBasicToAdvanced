// NEXT GREATER ELEMENT
//Given an array, print the Next Greater Element (NGE) for every element. The Next Greater Element for an
// element x is the first greater element on the right side of x in array.
// Elements for which no greater element exist, consider next greater element as -1.

// Simple Java program to print next
// greater elements in a given array
package Lecture11;

import java.util.*;

class NextGreater {
    /* prints element and NGE pair for
    all elements of arr[] of size n */
    static void printNGE(int arr[], int n) {
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "," + next);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int l = arr.length;
            printNGE(arr, l);
            t--;
        }
    }
}
