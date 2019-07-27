package Lecture7;

import java.util.*;

public class Mazepath_D {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();

        printMPWD(i1 - 1, i2 - 1, 0, 0, "");
        System.out.println();
        System.out.println(printCount(i1 - 1, i2 - 1, 0, 0, 0));
    }

    public static void printMPWD(int er, int ec, int cr, int cc, String result) {
        if (er == cr && ec == cc) {
            System.out.print(result + " ");
            return;
        }
        if (cc > ec || cr > er) {
            return;
        }
        printMPWD(er, ec, cr + 1, cc, result + "V");
        printMPWD(er, ec, cr, cc + 1, result + "H");
        printMPWD(er, ec, cr + 1, cc + 1, result + "D");
    }

    public static int printCount(int er, int ec, int cr, int cc, int count) {
        if (er == cr && ec == cc) {
            count = count + 1;
            return count;
        }
        if (cc > ec || cr > er) {
            return count;
        }

        count = printCount(er, ec, cr, cc + 1, count);
        count = printCount(er, ec, cr + 1, cc, count);
        count = printCount(er, ec, cr + 1, cc + 1, count);

        return count;

    }
}
