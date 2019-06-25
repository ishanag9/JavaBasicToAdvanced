//Take as input S, a string.
//        Write a function that toggles the case of all characters in the string. Print the value returned.

package Lecture5;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
                sb.append(c);
            } else {
                c = Character.toUpperCase(c);
                sb.append(c);
            }

        }
        System.out.print(sb.toString());
    }
}
