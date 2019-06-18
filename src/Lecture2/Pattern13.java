//Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).
//         *
//      *  *  *
//   *  *  *  *  *
//      *  *  *
//         *

package Lecture2;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n / 2;
        if (n > 0 && n < 10) {
            if (n % 2 == 0) {
                return;
            }
        }
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*\t");
                cst++;
            }
            System.out.println();
            if (row > (n / 2)) {
                nst = nst - 2;
                nsp++;
            } else {
                nst = nst + 2;
                nsp--;
            }
            row++;
        }
    }
}
