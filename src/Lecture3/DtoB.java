//Convert Decimal to Binary
package Lecture3;

import java.util.Scanner;

public class DtoB {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number to convert");
        int dec = s.nextInt();
        int bin = 0;
        int tenpowers = 1;
        while (dec != 0) {
            int rem = dec % 2;
            bin = bin + rem * tenpowers;
            tenpowers = tenpowers * 10;
            dec = dec / 2;
        }
        System.out.print(bin);
    }
}
