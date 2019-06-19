package Lecture2;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int nst = 1;
        int nsp = 5;
        while (row <= n) {
            int cst = 1;
            int value = 1;
            while (cst <= nst) {
                System.out.print(value);
                value++;
                cst++;
            }
            int csp = 1;
            while (csp<=nsp){
                System.out.print(" ");
                csp--;
            }
            cst = 1;

            while (cst<=nst){
                System.out.print(value);
                cst++;
                value--;
            }


            System.out.println();
            nst++;
            row++;

        }
    }
}
