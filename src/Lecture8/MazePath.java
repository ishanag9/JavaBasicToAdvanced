/*
package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int er = 2;
        int ec = 2;
        int cr = 0;
        int cc = 0;
        int ans = countMP(er, ec, cr, cc);
        System.out.println(ans);
        getMP(er, ec, cr, cc);
        String res = "";
        printMP(er, ec, cr, cc, res);
        getMPWD(er, ec, cr, cc);
        printMPWD(er, ec, cr, cc, res);
    }

    private static void printMPWD(int er, int ec, int cr, int cc, String res) {

    }

    private static ArrayList<String> getMPWD(int er, int ec, int cr, int cc) {

    }

    private static void printMP(int er, int ec, int cr, int cc, String res) {

    }

    private static ArrayList<String> getMP(int er, int ec, int cr, int cc) {

    }

    private static int countMP(int er, int ec, int cr, int cc) {
        if (cr == er || cc == ec) {
            return 1;
        }
//        int count;
        countMP(er, ec, cr + 1, cc, count);
        countMP(er, ec, cr, cc + 1, count);
        return count;

    }
}

*/
