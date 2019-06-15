//Print the following pattern (eg. range = 4)
//        1
//        2 3
//        4 5 6
//        7 8 9 10

package Lecture2;

import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
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
            row++;
            nst++;
        }
    }

}

