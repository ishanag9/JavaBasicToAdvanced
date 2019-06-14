package Lecture1;
//Taking N as input. Print all fibonnaci numbers less than equal to N.

//package Lec1;

import java.util.*;

public class PrintFibonacciNums {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int n = s.nextInt();

        int fn = 0, sn = 1, next = 0;

        while (next <= n) {
            System.out.println(next);
            fn = sn;
            sn = next;
            next = fn + sn;
        }

    }

}



