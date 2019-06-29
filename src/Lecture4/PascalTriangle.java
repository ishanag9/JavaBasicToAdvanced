package Lecture4;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        display(n);
    }


    //    Function to display the pascal triangle
    static void display(int n) {
        int i;
        for (i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "\t");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

