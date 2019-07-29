// Minimum INTEGER WITH AT MOST K SWAPS
//Given a positive integer, find minimum integer possible by doing at-most K swap operations on its digits.

package Lecture7;

import java.util.*;

class KSwaps {
    private static void swap(char[] c, int i, int j) {
        char ch = c[i];
        c[i] = c[j];
        c[j] = ch;
    }

    // Find minimum number formed by doing at-most k swap operations upon
    // digits of string
    public static int findMinimum(char[] c, int n, int k, int min_so_far) {
        // base case: no swaps left
        if (k < 1) {
            // get string from the char[] array
            String S = new String(c);

            // compare current number with minimum number so far
            if (S.compareTo(String.valueOf(min_so_far)) < 0) {
                min_so_far = Integer.valueOf(S);
            }

            return min_so_far;
        }

        // do for each digit in the input string
        for (int i = 0; i < n - 1; i++) {
            // compare the current digit with remaining digits
            for (int j = i + 1; j < n; j++) {
                // if the digit at i'th index is more than the digit
                // at j'th index
                if (c[i] > c[j]) {
                    // swap c[i] and c[j]
                    swap(c, i, j);

                    // recur for remaining k - 1 swaps
                    min_so_far = findMinimum(c, n, k - 1, min_so_far);

                    // backtrack - restore the array back
                    swap(c, i, j);
                }
            }
        }
        return min_so_far;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // input
        int i = s.nextInt();
        int k = s.nextInt(); // swaps

        // convert digits of the given integer to a char array to
        // facilitate operations on them
        char[] ch = String.valueOf(i).toCharArray();
        int minimum = findMinimum(ch, ch.length, k, i);

        System.out.println(minimum);
    }
}
