package Lecture5;

import java.util.Scanner;

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int res = 0;
        int n = str.length();
        for (int i = 0; i < 2 * n - 1; i++) {
            int left = i / 2;
            int right = (i + 1) / 2;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                res++;
                left--;
                right++;
            }
        }
        System.out.println(res);
    }
}