//Replace all ‘0’ with ‘5’ in an input Integer
package Lecture3;

import java.util.*;

public class ReplaceThemAll {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long rem = 0, x = 1, sum = 0;
        if (n == 0) {
            System.out.println(5);
        } else {
            while (n != 0) {
                rem = n % 10;
                if (rem == 0) {
                    sum = sum + x * 5;
                } else {
                    sum = sum + rem * x;
                }

                n = n / 10;
                x = x * 10;

            }
            System.out.println(sum);

        }
    }
}