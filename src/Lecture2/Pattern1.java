//Print following pattern
//        *****
//        *****
//        *****
//        *****
//        *****

package Lecture2;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 5;
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
