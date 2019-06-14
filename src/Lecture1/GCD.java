//returns the GCD of N1 and N2
package Lecture1;

import java.util.*;

public class GCD {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers to find there GCD");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println(n2);
    }

}
