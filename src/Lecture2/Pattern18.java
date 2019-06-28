// PATTERN INVERTEDHOURGLASS
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5

package Lecture2;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int nst=1;
        int nsp=(2*n-1);
        while(row<=(2*n+1)) {
            int cst=1;
            int value=n;
            while(cst<=nst) {
                System.out.print(value+"\t");
                cst++;
                value--;
            }
            int csp=1;
            while(csp<=nsp) {
                System.out.print(" "+"\t");
                csp++;
            }		int bst=1;
            if(value==-1) {
                value=value+2;
                while(bst<row) {
                    System.out.print(value+"\t");
                    value++;
                    bst++;
                }
            }

            else {
                value=value+1;
                while(value<=n) {
                    System.out.print(value+"\t");
                    value++;
                }




            }if(row>=n+1) {
                nst--;
                nsp=nsp+2;

            }else {
                nst++;
                nsp=nsp-2;
            }


            row++;
            System.out.println();
        }
    }
    }
