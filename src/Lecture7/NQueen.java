// N_QUEEN PROBLEM
//Take as input N, the size of a chess BOARD. We are asked to place N number of queens in it, so that no queen can kill other.
//
//a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the BOARD. Print the value returned.
//
//b. Write a recursive function which prints all valid configurations (void is the return type for function).

package Lecture7;

import java.util.*;

public class NQueen {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean[][] BOARD = new boolean[n][n];

        int count = countNQueens(BOARD, 0);

        System.out.println();

        System.out.print(count);

    }

    private static int countNQueens(boolean[][] BOARD, int ROW) {
        if (ROW == BOARD.length) {
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < ROW; j++) {
                    if (BOARD[i][j]) {
                        int q = i + 1;
                        int w = j + 1;
                        System.out.print("{" + q + "-" + w + "} ");
                    }
                }
            }
            System.out.print(" ");
            return 1;
        }
        int count = 0;
        for (int COL = 0; COL < BOARD[ROW].length; COL++) {
            if (isItSafe(BOARD, ROW, COL)) {
                BOARD[ROW][COL] = true;
                count = count + countNQueens(BOARD, ROW + 1);
                BOARD[ROW][COL] = false;
            }
        }

        return count;
    }

    private static boolean isItSafe(boolean[][] BOARD, int ROW, int COL) {
        for (int i = ROW; i >= 0; i--) {
            if (BOARD[i][COL]) {
                return false;
            }
        }

        for (int i = ROW, j = COL; i >= 0 && j >= 0; i--, j--) {
            if (BOARD[i][j]) {
                return false;
            }
        }

        for (int i = ROW, j = COL; i >= 0 && j < BOARD.length; i--, j++) {
            if (BOARD[i][j]) {
                return false;
            }
        }

        return true;
    }
}
