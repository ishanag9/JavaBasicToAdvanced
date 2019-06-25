package Lecture5;

import java.util.*;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcg";
        replaceOEchar(str);
    }

    private static void replaceOEchar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (i % 2 != 0) {
                cc = (char) (cc - 1);
                sb.append(cc);
            } else {
                cc = (char) (cc + 1);
                sb.append(cc);
            }

        }
        System.out.println(sb.toString());

    }
}
