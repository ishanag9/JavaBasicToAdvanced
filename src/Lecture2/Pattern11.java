//PATTERN RHOMBUS (N=3)
//         1
//       2 3 2
//     3 4 5 4 3
//       2 3 2
//         1

package Lecture2;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("<--Enter range-->");
        int n = s.nextInt();
        int row = 1;

        while (row <= 2*n-1) {
            int csp = 1;
            int nsp = n -row;
            while (csp <= nsp) {
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
            if(row<n){
                nsp--;
            }else{
                nsp++;
            }
            row++;
            System.out.println();
        }
    }
}
