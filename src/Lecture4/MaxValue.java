//Take as input N, the size of array. Take N more inputs and store that in an array.
//        Write a function which returns the maximum value in the array. Print the value returned.
//
//        1.It reads a number N.
//
//        2.Take Another N numbers as input and store them in an Array.
//
//        3.calculate the max value in the array and return that value.

package Lecture4;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        inputarr(arr,s);
//        displayarr(arr);
//        maxValue(arr);
        System.out.println(maxValue(arr));
    }

    private static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void displayarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] inputarr(int[] arr, Scanner s) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
