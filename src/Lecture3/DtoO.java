//convert number decimal to octal
package Lecture3;

import java.util.Scanner;

public class DtoO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter decimal number to convert in octal");
        int dec = s.nextInt();
        int oct = 0;
        int tenpowers = 1;
        while (dec != 0) {
            int rem = dec % 8;
            oct = oct + rem * tenpowers;
            tenpowers = tenpowers * 10;
            dec = dec / 8;
        }
        System.out.println(oct);
    }
}
