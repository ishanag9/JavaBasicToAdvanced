package Lecture5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
                convertD2B(i);
                i++;
            }
            System.out.println();
            t--;
        }
    }

    private static void convertD2B(int i) {
        int dec = i;
        int bin = 0;
        int tenpowers = 1;
        while (dec != 0) {
            int rem = dec % 2;
            bin = bin + rem * tenpowers;
            tenpowers = tenpowers * 10;
            dec = dec / 2;
        }
        System.out.print(bin + " ");
    }
}
