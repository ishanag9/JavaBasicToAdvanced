// Take as input a 2-d array.Print the 2-D array in sprial form clockwise.
//        Sample Input:
//        4 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        41 42 43 44
//
//        Sample Output:
//        11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END

package Lecture5;

import java.util.*;

public class SpiralPrintClockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
//        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        input2Darr(arr, m, n, s);
        spiralPrint(arr);
    }

    private static int[][] input2Darr(int[][] arr, int m, int n, Scanner s) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();

            }
        }
        return arr;
    }

    private static void spiralPrint(int[][] arr) {
        int top = 0, left = 0;
        int bottom = arr[left].length - 1;
        int right = arr[top].length - 1;
        int dir = 1;
        int count = (bottom + 1) * (right + 1);

        while (left <= right && top <= bottom) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i]+", ");
                        count--;
                    }
                }
                dir = 2;
                top++;
            }

            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right]+", ");
                        count--;
                    }
                }
                dir = 3;
                right--;
            }

            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i]+", ");
                        count--;
                    }
                }
                dir = 4;
                bottom--;
            }

            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left]+", ");
                        count--;
                    }
                }
                dir = 1;
                left++;
            }
        }
        System.out.println("END");
    }
}
