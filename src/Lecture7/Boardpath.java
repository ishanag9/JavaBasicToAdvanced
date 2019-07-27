package Lecture7;

import java.util.*;

public class Boardpath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        PrintBP(n, 0, m, "");
        System.out.println();
        System.out.println(PrintCount(n, 0, m));
    }

    public static void PrintBP(int end, int current, int m, String result) {
        if (current == end) {
            System.out.print(result + " ");
            return;
        }
        if (current > end) {
            return;
        }

        for (int dice = 1; dice <= m; dice++) {

            PrintBP(end, current + dice, m, result + dice);
        }
        return;
    }

    public static int PrintCount(int end, int current, int m) {
        if (current == end) {
            return 1;
        }
        if (current > end) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= m; dice++) {

            count += PrintCount(end, current + dice, m);
        }

        return count;
    }
}