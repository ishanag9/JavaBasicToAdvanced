//Replace all ‘0’ with ‘5’ in an input Integer
package Lecture3;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        long n = s.nextInt();
        replace(n);
    }

    private static void replace(long n) {
        int rem;
        int k = 0;
        while (n != 0) {
            rem = (int) (n % 10);
            if (rem != 0) {
                k = k * 10 + rem;
            } else {
                k = k * 10 + 5;
            }
            n = n / 10;
        }
        while (k != 0) {
            rem = k % 10;
            n = n * 10 + rem;
            k = k / 10;
        }
        System.out.println(n);
    }
}
