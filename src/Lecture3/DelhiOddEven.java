/*
Due to growing Traffic Problem Kejriwal wants to devise a new scheme.
The scheme is as follows, each car will be allowed to run on Sunday
if the sum of digits which are even is divisible by 4
or sum of digits which are odd in that number is divisible by 3.
However to check every car for the above criteria can't be done by the Delhi Police.
You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
*/
package Lecture3;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of vehicles");
        int ncars = s.nextInt();
        int sum1 = 0, sum2 = 0;
        int i = 1;
        while (i <= ncars) {
            System.out.println("Enter unique vehicle number");
            int n = s.nextInt();
            while (n != 0) {
                int rem = n % 10;
                if (rem % 2 == 0) {
                    sum1 = sum1 + rem;
                    n = n / 10;
                } else {
                    sum2 = sum2 + rem;
                    n = n / 10;
                }
            }
            if (sum1 % 4 != 0 && sum2 % 3 != 0) {
                System.out.println("Not Allowed");
            } else {
                System.out.println("Allowed");
            }
            sum1=0;
            sum2=0;
            i++;
        }
    }
}
