//Print following pattern (eg. range = 4)
/*              1
            2	3	2
        3	4	5	4	3
    4	5	6	7	6	5	4
        3	4	5	4	3
            2	3	2
                1
*/
package Lecture2;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= n - row) {
                System.out.print("\t");
                csp++;
            }
            int cst = 1;
            int value = row;
            while (cst <= row) {
                System.out.print(value + "\t");
                value++;
                cst++;
            }
            value = value - 2;
            cst = 1;
            while (cst < row) {
                System.out.print(value + "\t");
                value--;
                cst++;
            }
            row++;
            System.out.println();
        }
        lowerhalf(n);
    }

    private static void lowerhalf(int n) {
        int row = 1;
        int nst = n - 1;
        while (row < n) {
            int csp = 1;
            int nsp = row;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }

            int cst = 1;
            int value = n - row;
            while (cst <= n - row) {
                System.out.print(value + "\t");
                value++;
                cst++;
            }
            value = value - 2;
            cst = 1;
            while (cst < n - row) {
                System.out.print(value + "\t");
                value--;
                cst++;
            }
            row++;
            System.out.println();
        }
    }
}

