//Given a list of numbers,
// stop processing input after the cumulative sum of all the input becomes negative.

//Print all the numbers before the cumulative sum become negative.

package Lecture3;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (sum >= 0) {
            int n = s.nextInt();
            sum = sum + n;
            if (sum >= 0) {
                System.out.println(n);
            } else {
                return;
            }
        }

    }
}
