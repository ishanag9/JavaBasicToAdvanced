//Print following pattern (eg. range = 4)
//        1
//        232
//        34543
//        4567654

package Lecture2;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= n - row) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            int value = row;
            while (cst <= row) {
                System.out.print(value);
                value++;
                cst++;
            }
            value = value - 2;
            cst = 1;
            while (cst < row) {
                System.out.print(value);
                value--;
                cst++;
            }
            row++;
            System.out.println();
        }
    }
}
