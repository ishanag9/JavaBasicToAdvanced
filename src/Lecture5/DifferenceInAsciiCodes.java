package Lecture5;

import java.util.*;

public class DifferenceInAsciiCodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        insertAscii(str);
    }

    private static void insertAscii(String str) {
        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char cc = str.charAt(i);
            sb.append(prev);
            sb.append(cc - prev);
            prev = cc;
        }
        sb.append(prev);
        System.out.println(sb.toString());
    }
}
