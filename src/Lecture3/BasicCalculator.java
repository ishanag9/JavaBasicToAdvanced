package Lecture3;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter operation(+,-,*,/,%) X or x to terminate");
        while (true) {
            char c = s.next().charAt(0);
            if ((c == 'x') || (c == 'X')) {
                return;
            }
            if (c == '+') {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                System.out.println(n1 + n2);
            } else if (c == '-') {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                System.out.println(n1 - n2);
            } else if (c == '*') {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                System.out.println(n1 * n2);
            } else if (c == '/') {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                System.out.println(n1 / n2);
            } else if (c == '%') {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                System.out.println(n1 % n2);
            } else {
                System.out.println("Invalid operation. Try again.");
            }


        }
    }
}
