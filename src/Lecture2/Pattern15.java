//PATTERN HOURGLASS (eg. range = 4)
//        432101234
//         3210123
//          21012
//           101
//            0
//           101
//          21012
//         3210123
//        432101234

package Lecture2;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();
        int row = 1;
        int nsp = 0;
        int nst = n;
        int value = n;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            nsp++;
            int cst = 1;
            while (cst <= nst) {
                System.out.print(value);
                value--;
                cst++;
            }
            if (value < nst) {
                System.out.print("0");
            }
            cst = 1;
            value++;
            while (cst <= nst) {
                System.out.print(value);
                value++;
                cst++;
            }
            System.out.println();
            row++;
            nst--;
            value = nst;
        }
        printzero(n);
        lowerhalf(n);
    }

    private static void lowerhalf(int n) {
        int row = 1;
        int nst = 1;
        int nsp = n - 1;
        int value = nst;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            nsp--;
            int cst = 1;
            while (cst <= nst) {
                System.out.print(value);
                value--;
                cst++;
            }
            if (value < cst) {
                System.out.print("0");
            }
            cst = 1;
            value++;
            while (cst <= nst) {
                System.out.print(value);
                value++;
                cst++;
            }
            System.out.println();
            row++;
            nst++;
            value = nst;

        }
    }

    private static void printzero(int n) {
        int nst = 1;
        int nsp = n;
        int csp = 1;
        while (csp <= nsp) {
            System.out.print(" ");
            csp++;
        }
        int cst = 1;
        while (cst <= nst) {
            System.out.println("0");
            cst++;
        }

    }
}
