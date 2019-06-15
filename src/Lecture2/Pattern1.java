//Print following pattern
//        *****
//        *****
//        *****
//        *****
//        *****

package Lecture2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int row = 1;
        int nst = n;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            row++;
        }
    }
}
