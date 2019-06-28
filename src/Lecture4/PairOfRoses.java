package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter test cases");
        int t = s.nextInt();
        while (t > 0) {
            System.out.println("Enter number of available roses");
            int n = s.nextInt();
            int[] arr = new int[n];
            inputarr(arr, s);
            Arrays.sort(arr);
            System.out.println("Enter money deepak have");
            int money = s.nextInt();
            int sum = 0;
            boolean test = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == money) {
                        if (test) {
                            sum = arr[j] - arr[i];
                            test = false;
                        }
                        int min = arr[j] - arr[i];
                        if (min <= sum) {
                            sum = min;
                        }
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] + arr[j] == money && arr[j] - arr[i] == sum) {

                        System.out.println("Deepak should buy roses whose prices are " +
                                arr[i] +
                                " and " +
                                arr[j] + " .");
                        System.out.println();
                    }
                }
            }

            t--;
        }
    }


    private static int[] inputarr(int[] arr, Scanner s) {
        System.out.println("Enter each roses price");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
