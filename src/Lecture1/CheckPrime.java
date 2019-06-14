//Check whether the given number is prime or not
package Lecture1;

import java.util.*;

public class CheckPrime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to find its prime or not");
        int n = s.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
            i++;
        }
        System.out.println("Prime");
    }
}

