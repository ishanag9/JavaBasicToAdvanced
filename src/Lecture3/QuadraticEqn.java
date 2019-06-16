//Revising Quadratic Equations
//Given coefficients of a quadratic equation ,
//you need to print the nature of the roots (real and distinct , real and equal , imaginary)
// and the value of roots
package Lecture3;

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three coefficients a,b,c of quadratic eqn resp.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = ((b * b) - (4 * a * c));
        int root1, root2;
        if (d == 0) {
            root1 = (-b) / (2 * a);
            root2 = (-b) / (2 * a);
            System.out.println("Real and Equal");
            System.out.println(root1 + " " + root2);
        }
        if (d > 0) {
            root1 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            root2 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            System.out.println("Real and Distinct");
            System.out.println(root1 + " " + root2);
        }
        if (d < 0) {
            System.out.println("Imaginary");
            root1 = root2 = (-b) / (2 * a);
            int i = (int) ((Math.sqrt(-d)) / (2 * a));
            System.out.println(root1 + "+" + i + "i" + " " + root2 + "-" + i + "i");
        }
    }
}
