//Take as input S, a string. Write a function that returns the character with maximum frequency.
//        Print the value returned.




        package Lecture5;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        maxchar(str);
    }

    private static void maxchar(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int max = 0;
        char prev = str.charAt(0);
        char res = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (prev == cc) {
                count++;
            }
            if (count > max) {
                max = count;
                res = str.charAt(i);
            }

            prev = cc;
        }
        sb.append(res);
        System.out.println(sb.toString());
    }
}
