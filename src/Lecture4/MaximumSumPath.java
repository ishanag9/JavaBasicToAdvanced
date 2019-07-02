//MAXIMUM SUM PATH IN TWO ARRAYS
//        You are provided two sorted arrays.
//        You need to find the maximum length of bitonic subsequence.
//        You need to find the sum of the maximum sum path
//            to reach from beginning of any array to end of any of the two arrays.
//        You can switch from one array to another array only at common elements.

package Lecture4;

import java.util.Scanner;

public class MaximumSumPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int m = s.nextInt();
            int n = s.nextInt();
//            int[] arr1 = {2, 3, 7, 10, 12, 15, 30, 34};
//            int[] arr2 = {1, 5, 7, 8, 10, 15, 16, 19};
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];
            inputarr(arr1, s);
            inputarr(arr2, s);
            int result = maxSumPathIn2Arrays(arr1, arr2);
            System.out.println(result);
            t--;
        }
    }

    private static int[] inputarr(int[] arr, Scanner s) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


    private static int maxSumPathIn2Arrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 = sum1 + arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                sum2 = sum2 + arr2[j++];
            } else {
                if (sum1 > sum2) {
                    result = result + sum1;
                } else {
                    result = result + sum2;
                }
                sum1 = 0;
                sum2 = 0;
                while (i < arr1.length && j < arr2.length && arr1[i] == arr2[j]) {
                    result = result + arr1[i++];
                    j++;
                }
            }
        }
        while (i < arr1.length) {
            sum1 = sum1 + arr1[i++];
        }
        while (j < arr2.length) {
            sum2 = sum2 + arr2[j++];
        }
        if (sum1 > sum2) {
            result = result + sum1;
        } else {
            result = result + sum2;
        }
        return result;
    }
}