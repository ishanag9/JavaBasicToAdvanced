//  You are provided n numbers (both +ve and -ve).
//  Numbers are arranged in a circular form. You need to find the maximum sum of consecutive number.
//
//        Sample Input:
//        1
//        7
//        8 -8 9 -9 10 -11 12
//
//        Sample Output:
//        22

package Lecture4;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter test cases");
        int t = s.nextInt();
        while (t > 0) {
            System.out.println("Enter size of array");
            int n = s.nextInt();
            int[] arr = new int[n];
//            int arr[] =  {8, -8, 9, -9, 10, -11, 12};
            System.out.println("Enter " + n + " elements of array");
            intputarr(arr, s);

//            kadane(arr);
//            maxCircularSum(arr);
            System.out.println(maxCircularSum(arr));
            t--;
        }
    }

    private static int maxCircularSum(int[] arr) {
        int kadane_result = kadane(arr);
        int max_Wrap = 0;
        for (int i = 0; i < arr.length; i++) {
            max_Wrap = max_Wrap + arr[i];
            arr[i] = -arr[i];
        }
        max_Wrap = max_Wrap + kadane(arr);
        return (max_Wrap > kadane_result ? max_Wrap : kadane_result);
    }

    //kadane algorithm
    private static int kadane(int[] arr) {
        int max = arr[0];
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxsum = maxsum + arr[i];
            if (maxsum < 0) {
                maxsum = 0;
            }
            if (max < maxsum) {
                max = maxsum;
            }
        }
        return max;
    }

    private static int[] intputarr(int[] arr, Scanner s) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
