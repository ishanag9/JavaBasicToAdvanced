//Print following pattern (eg. range = 5)
// *****
//   ****
//     ***
//       **
//         *
//       **
//     ***
//   ****
// *****

package Lecture2;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;
        while (row <= 2 * n - 1) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            if (row < n) {
                nst--;
                nsp = nsp + 2;
            } else {
                nst++;
                nsp = nsp - 2;
            }
            row++;
            System.out.println();
        }

    }
}
