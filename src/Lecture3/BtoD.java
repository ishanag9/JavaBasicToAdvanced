//Convert binary number in decimal
package Lecture3;

import java.util.Scanner;

public class BtoD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter binary number to convert in decimal");
        int bin = s.nextInt();
        int dec = 0;
        int twopowers = 1;
        while (bin != 0) {
            int rem = bin % 10;
            dec = dec + rem * twopowers;
            twopowers = twopowers * 2;
            bin = bin / 10;
        }
        System.out.println(dec);
    }
}
