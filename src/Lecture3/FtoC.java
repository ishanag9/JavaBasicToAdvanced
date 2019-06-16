////Use of Datatypes
//Take the following as input.
//
//        Minimum Fahrenheit value
//        Maximum Fahrenheit value
//        Step
//
//        Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32)

package Lecture3;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minF = s.nextInt();
        int maxF = s.nextInt();
        int step = s.nextInt();
        while (minF <= maxF) {
            int C = (int) ((5.0 / 9) * (minF - 32));
            System.out.println(minF + "\t" + C);
            minF = minF + step;
        }
    }
}
