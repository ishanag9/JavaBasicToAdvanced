package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        inputarr(arr, s);
        System.out.println("Enter target");
        int target = s.nextInt();
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }

                }


            }
        }
    }


    private static int[] inputarr(int[] arr, Scanner s) {
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

}
