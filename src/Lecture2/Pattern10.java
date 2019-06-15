//FIBONACCI PATTERN (eg. range = 4)
//        0
//        1 1
//        2 3 5
//        8 13 21 34

package Lecture2;

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int nst = 1;
        int row = 1;
        int fn = 0;
        int sn = 1;
        int next = 0;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print(fn + "\t");
                next = fn + sn;
                fn = sn;
                sn = next;
                cst++;

            }
            System.out.println();
            row++;
            nst++;
        }
    }

}

