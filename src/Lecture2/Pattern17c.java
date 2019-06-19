/*
Print the following pattern (eg. range = 5)         PRINTED
        *	*	*	*	*
        *	*		*	*
        *				*
        *	*		*	*
        *	*	*	*	*
*/
package Lecture2;

import java.util.Scanner;

public class Pattern17c {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int hn = (n + 1) / 2;
        int equi, equj;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= hn) {
                    equi = i;
                    System.out.print("");
                } else {
                    equi = n - i + 1;
                    System.out.print("");
                }
                if (j <= hn) {
                    equj = j;
                } else {
                    equj = n - j + 1;
                }
                if (equi + equj <= hn + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

