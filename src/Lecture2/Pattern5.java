//Print following pattern (eg. range = 5)
/*
      *****
        ****
          ***
            **
              *
*/

package Lecture2;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;
        while (row <= n) {
            int csp = 0;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst--;
            nsp = nsp + 2;
            row++;
        }
    }
}
