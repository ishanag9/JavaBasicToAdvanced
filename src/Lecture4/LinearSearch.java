/*
Take as input N, the size of an array. Take N more inputs and store that in an array.
        Take another number’s input as M. Write a function which returns the index on which M is found in an array,
        in case M is not found -1 is returned. Print the value returned.

        It reads a number N. 2.Take Another N numbers as an input and store them in an Array.
        Take another number M as an input.
        If M is found in the Array the index of M is returned else -1 is returned and print the value returned.
*/



        package Lecture4;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        inputarr(arr,s);
        int m = s.nextInt();
        System.out.println("Index by linear search: " + linearSearch(arr, m));
    }
    private static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                return i;
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
