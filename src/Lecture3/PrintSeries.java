//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
//Sample Input:                                 Sample Output:
//              10                                            5
//              4                                             11
//                                                            14
//                                                            17
//                                                            23
//                                                            26
//                                                            29
//                                                            35
//                                                            38
//                                                            41
//                                                            10
//                                                            4

package Lecture3;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1 & n2");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int series = 0;
        int i = 1;
        while (i <= n1) {
            series = 3 * i + 2;
            if (series % n2 == 0) {
                n1++;
            } else {
                System.out.println(series);
            }
            i++;
        }
    }
}
