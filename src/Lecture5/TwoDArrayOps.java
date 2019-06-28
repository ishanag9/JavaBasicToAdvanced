package Lecture5;

import java.util.Scanner;

public class TwoDArrayOps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        inputarr(arr, s, m, n);
        waveprint(arr,m,n);
//            System.out.println();
//            spiralprint(arr);
    }

    private static int[][] inputarr(int[][] arr, Scanner s, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();

            }
        }
        return arr;
    }

//    private static void spiralprint(int[][] arr) {
//
//        }

    private static void waveprint(int[][] arr,int m,int n) {

        for (int row = 0; row < m; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < n; col++) {
                    System.out.print(arr[row][col] + ", ");
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    System.out.print(arr[row][col] + ", ");
                }
            }
//                System.out.println();
        }
        System.out.println("END");
    }

}