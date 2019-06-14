package Lecture1;

import java.util.*;

public class PRINTREVERSE {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num = s.nextInt();
        int rev = 0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }

}