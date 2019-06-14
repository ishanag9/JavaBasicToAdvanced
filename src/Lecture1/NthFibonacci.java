//NthFibonacciNumber
package Lecture1;

import java.util.*;

public class NthFibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Nth term to find its fibonacci number");
        int n = s.nextInt();

        int fn = 0, sn = 1, next;
        int counter = 0;

        while (counter < n) {
            next = fn + sn;
            fn = sn;
            sn = next;
            counter++;
        }
        System.out.println(fn);
    }

}
