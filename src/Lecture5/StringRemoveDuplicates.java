//Take as input S, a string. Write a function that removes all consecutive duplicates.
//Print the value returned.

package Lecture5;

import java.util.Scanner;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i =0;
        String str = s.nextLine();
        char cc = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (i = 1; i < str.length(); i++) {
            if (cc == str.charAt(i)) {
                cc = str.charAt(i);
            } else {
                sb.append(cc);
                cc = str.charAt(i);
            }
        }
        sb.append(str.charAt(i-1));
        System.out.println(sb.toString());
    }
}
