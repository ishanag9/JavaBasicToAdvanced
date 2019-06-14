//print N prime numbers to the range given by user
package Lecture1;

import java.util.*;

public class PrintPrimes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to find the prime numbers upto that range");
        int n = s.nextInt();
        int i;
        int count;
        int num = 1;

        while (num <= n) {
            i = 2;
            count = 0;
            while (i <= num / 2) {
                if (num % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && num != 1)
                System.out.println(num);
            num++;
        }
    }
}

