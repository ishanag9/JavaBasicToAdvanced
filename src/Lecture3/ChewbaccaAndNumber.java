package Lecture3;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        int rem1 = 0;
        int rem2 = 0;
        int count = 0;
        while (n != 0) {
            rem1 = n % 10;
            n = n / 10;
            count++;
            {
                while (n != 0) {
                    rem2 = n % 10;
                    n = n / 10;
                    count++;
                }
            }
        }
        if (rem2 < rem1) {
            while (count != 0) {
                System.out.print(rem2);
                count--;
            }
        }

    }
}
/*
        #1	run-error
        #2	run-error
        #3	no-output
        #4	no-output
        #5	wrong-answer*/
