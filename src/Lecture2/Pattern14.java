/*Print the following pattern (eg. range = 5)    PRINTED
        1								1
        1	2						2	1
        1	2	3				3	2	1
        1	2	3	4		4	3	2	1
        1	2	3	4	5	4	3	2	1

*/
package Lecture2;

import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        int i, j, k, l, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        n = s.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print(j + "\t");
                else
                    System.out.print("\t");
            }
            for (k = n - 1; k > i; k--) {
                System.out.print("\t");
            }
            l = i;
            if (l == n) {
                l = l - 1;
                while (l > 0) {
                    System.out.print(l + "\t");
                    l--;
                }
            } else if (l < n) {
                while (l > 0) {
                    System.out.print(l + "\t");
                    l--;
                }
            }
            System.out.println();
        }

    }
}
