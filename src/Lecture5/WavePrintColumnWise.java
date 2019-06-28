package Lecture5;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        input2Darr(arr, m, n, s);
//        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        waveprintcolumn(arr, m, n);

    }

    private static int[][] input2Darr(int[][] arr, int m, int n, Scanner s) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();

            }
        }
        return arr;
    }

    private static void waveprintcolumn(int[][] arr, int m, int n) {
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < m; row++) {
                    System.out.print(arr[row][col] + ", ");

                }


            } else {
                for (int row = m-1; row >= 0; row--) {
                    System.out.print(arr[row][col] + ", ");

                }
            }

        }
        System.out.println("END");
    }
}
