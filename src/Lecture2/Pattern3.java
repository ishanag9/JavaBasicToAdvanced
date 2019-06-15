//Print following pattern (eg. range = 5)
/*
        1
        2	3
        4	5	6
        7	8	9	10
        11	12	13	14	15
*/

package Lecture2;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;
        int nst = 1;
        int value = 1;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print(value + "\t");
                cst++;
                value++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
