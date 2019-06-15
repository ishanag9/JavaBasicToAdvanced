//Print following pattern (eg. range = 5)
/*
        1
        2*2
        3*3*3
        4*4*4*4
        5*5*5*5*5
*/

package Lecture2;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;
        int nst = 1;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                if (cst % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(row);
                }
                cst++;
            }
            System.out.println();
            row++;
            nst = nst + 2;
        }
    }
}
