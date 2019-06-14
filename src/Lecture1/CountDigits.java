package Lecture1;

import java.util.*;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.println("Enter number to count its recurrences");
        int m = s.nextInt();

        int count = 0;

        int rem;

        while (n > 0) {
            rem = n % 10;
            if (rem == m) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }

}

