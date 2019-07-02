//  You are given an input array whose each element represents the height of a line towers.
//  The width of every tower is 1. It starts raining.
//  Water is filled between the gap of towers if possible.
//  You need to find how much water filled between these given towers.

//        Sample Input:
//        2
//        6
//        3  0  0  2  0  4
//        12
//        0  1  0  2  1  0  1  3  2  1  2  1

//        Sample Output:
//        10
//        6

package Lecture4;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter test cases");
        int t = s.nextInt();
        while (t > 0) {
            System.out.println("Enter number of towers");
            int n = s.nextInt();
            int[] arr = new int[n];
            inputArr(arr, s);
//            Max height of tower from left
            int[] lm = new int[n];
//            Max height of tower from right
            int[] rm = new int[n];
            int result = 0;

            int max = arr[0];
            lm[0] = arr[0];
            for (int i = 0; i < lm.length; i++) {
                if (arr[i] > max) {
                    lm[i] = arr[i];
                    max = arr[i];
                } else {
                    lm[i] = max;
                }
            }

            max = arr[arr.length-1];
            rm[rm.length-1] = arr[arr.length-1];
            for (int i = rm.length - 1; i >= 0; i--) {
                if (arr[i] > max) {
                    rm[i] = arr[i];
                    max = arr[i];
                } else {
                    rm[i] = max;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                result += Math.min(lm[i], rm[i]) - arr[i];
            }

            System.out.println(result);

            t--;
        }
    }

    private static void inputArr(int[] arr, Scanner s) {
        System.out.println("Enter height of each tower");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }
}
