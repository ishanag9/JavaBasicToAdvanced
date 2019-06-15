//Print the following pattern (eg. range = 5)
//        1
//        2 2
//        3 0 3
//        4 0 0 4
//        5 0 0 0 5
//If row number is n (>1), total character is n. First and last character is n and rest are 0.

package Lecture2;

import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int row = 1;
        int nst = 1;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                if (cst == nst || cst == 1) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print("0\t");
                }
                cst++;

            }
            System.out.println();
            row++;
            nst++;
        }
    }

}

