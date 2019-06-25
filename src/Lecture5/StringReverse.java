package Lecture5;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder A = new StringBuilder();
        A.append(sc.next());
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder();
        B.append(A);
        B = B.reverse();
        System.out.println((A.toString().equals(B.toString())) ? "Yes" : "No");

    }

}





