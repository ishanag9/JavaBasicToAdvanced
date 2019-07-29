// SUDOKU SOLVER
//You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
//To learn more about sudoku, go to this link Sudoku-Wikipedia.

package Lecture7;

import java.util.*;

public class SudokuSolver {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int ROW = s.nextInt();
        int[][] array = new int[ROW][ROW];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < ROW; j++) {
                array[i][j] = s.nextInt();
            }
        }

        if (solveSudoku(array, ROW)) {
            print(array, ROW); // print solution
        }

    }

    private static void print(int[][] BOARD, int n) {
        // we got the answer, just print it
        for (int r = 0; r < n; r++) {
            for (int d = 0; d < n; d++) {
                System.out.print(BOARD[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % (int) Math.sqrt(n) == 0) {
                System.out.print("");
            }
        }
    }

    private static boolean isSafe(int[][] BOARD, int ROW, int COL, int NUM) {
// ROW has the unique (ROW-clash)
        for (int d = 0; d < BOARD.length; d++) {
// if the NUMber we are trying to
// place is already present in
// that ROW, return false;
            if (BOARD[ROW][d] == NUM) {
                return false;
            }
        }

// COLumn has the unique NUMbers (COLumn-clash)
        for (int r = 0; r < BOARD.length; r++) {
// if the NUMber we are trying to
// place is already present in
// that COLumn, return false;
            if (BOARD[r][COL] == NUM) {
                return false;
            }
        }

// corresponding square has
// unique NUMber (box-clash)
        int sqrt = (int) Math.sqrt(BOARD.length);
        int boxRowStart = ROW - ROW % sqrt;
        int boxColStart = COL - COL % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                if (BOARD[r][d] == NUM) {
                    return false;
                }
            }
        }

// if there is no clash, it's safe
        return true;
    }

    private static boolean solveSudoku(int[][] BOARD, int n) {
        int ROW = -1;
        int COL = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (BOARD[i][j] == 0) {
                    ROW = i;
                    COL = j;

                    // we still have some remaining
                    // missing values in Sudoku
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

// no empty space left
        if (isEmpty) {
            return true;
        }

// else for each-ROW backtrack
        for (int NUM = 1; NUM <= n; NUM++) {
            if (isSafe(BOARD, ROW, COL, NUM)) {
                BOARD[ROW][COL] = NUM;
                if (solveSudoku(BOARD, n)) {
                    // print(BOARD, n);
                    return true;
                } else {
                    BOARD[ROW][COL] = 0; // replace it
                }
            }
        }
        return false;
    }


}
