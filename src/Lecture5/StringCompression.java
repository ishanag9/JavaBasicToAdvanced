// Take as input S, a string. Write a function that does basic string compression.
// Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

package Lecture5;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char cc = str.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (cc == str.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append("" + cc + count);
                } else {
                    sb.append(cc);
                }
                cc = str.charAt(i);
                count = 1;
            }
        }
        if (count > 1) {
            sb.append("" + cc + count);
        } else {
            sb.append(cc);
        }
        System.out.println(sb.toString());
    }
}
