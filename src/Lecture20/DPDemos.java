package Lecture20;

import java.util.Map;

public class DPDemos {
    public static long start;
    public static long end;

    public static void startAlgo() {
        start = System.currentTimeMillis();
    }

    public static long endAlgo() {
        end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] arr = new int[n + 1];
        int[][] storage = new int[n + 1][n + 1];

//         uncomment to check

//        startAlgo();
//        System.out.println(fib(n));
//        System.out.println("Fib normal took time " + endAlgo());
//
//        startAlgo();
//        System.out.println(fibRS(n, arr));
//        System.out.println("FibRS took time " + endAlgo());
//
//        startAlgo();
//        System.out.println(fibIS(n));
//        System.out.println("FibIS took time " + endAlgo());


//        startAlgo();
//        System.out.println(cbp(n, 0));
//        System.out.println("cbp Normal took time: " + endAlgo());
//
//        startAlgo();
//        System.out.println(cbpRS(n, 0, arr));
//        System.out.println("cbpRS took time : " + endAlgo());
//
//        startAlgo();
//        System.out.println(cbpIS(n, 0));
//        System.out.println("cbpIS took time : " + endAlgo());


//        startAlgo();
//        System.out.println(cmp(n, n, 0, 0));
//        System.out.println("cmp Normal took time : " + endAlgo());
//
//        startAlgo();
//        System.out.println(cmpRS(n, n, 0, 0, storage));
//        System.out.println("cmpRS took time : " + endAlgo());
//
//        startAlgo();
//        System.out.println(cmpIS(n, n, 0, 0));
//        System.out.println("cmpIS took time : " + endAlgo());

        String s1 = "abcd";
        String s2 = "dabc";

//        startAlgo();
//        System.out.println(lcs(s1, s2));
//        System.out.println("lcs Normal took time : " + endAlgo());
//
//        startAlgo();
//        System.out.println(lcsI(s1, s2));
//        System.out.println("lcsI Normal took time : " + endAlgo());

        startAlgo();
        System.out.println(editDistance(s1, s2));
        System.out.println("editDistance Normal took time : " + endAlgo());

        startAlgo();
        System.out.println(editDistanceI(s1, s2));
        System.out.println("editDistance Iteratively took time : " + endAlgo());

    }


    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    private static int fibRS(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (arr[n] != 0) {
            return arr[n];
        }

        int fibnm1 = fibRS(n - 1, arr);
        int fibnm2 = fibRS(n - 2, arr);
        int fibn = fibnm1 + fibnm2;
        arr[n] = fibn;
        return fibn;
    }

    private static int fibIS(int n) {
        int[] strg = new int[n + 1];

        // seed
        strg[0] = 0;
        strg[1] = 1;
        for (int i = 2; i <= n; i++) {
            strg[i] = strg[i - 1] + strg[i - 2];
        }

        return strg[n];
    }

    //    count board path
    public static int cbp(int end, int curr) {
        if (curr == end) {
            return 1;
        }
        if (curr > end) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count = count + cbp(end, curr + dice);
        }
        return count;
    }

    //    recursive storage
    public static int cbpRS(int end, int curr, int[] arr) {
        if (curr == end) {
            return 1;
        }
        if (curr > end) {
            return 0;
        }

        if (arr[curr] != 0) {
            return arr[curr];
        }

        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count = count + cbpRS(end, curr + dice, arr);
        }
        arr[curr] = count;
        return count;
    }

    //    iterative storage
    public static int cbpIS(int end, int curr) {
        int[] strg = new int[end + 1];

        // seed
        strg[end] = 1;
        for (int i = end - 1; i >= 0; i--) {
            int count = 0;
            for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
                count = count + strg[dice + i];
            }
            strg[i] = count;
        }
        return strg[curr];

    }


    //    count maze path
    public static int cmp(int er, int ec, int cr, int cc) {
        if (er == cr && ec == cc) {
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }
        int count = 0;
        int rcount = cmp(er, ec, cr, cc + 1);
        int dcount = cmp(er, ec, cr + 1, cc);
        count = rcount + dcount;
        return count;
    }

    //    recursive storage
    public static int cmpRS(int er, int ec, int cr, int cc, int[][] arr) {
        if (er == cr && ec == cc) {
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }

        if (arr[cr][cc] != 0) {
            return arr[cr][cc];
        }
        int count = 0;
        int rcount = cmpRS(er, ec, cr, cc + 1, arr);
        int dcount = cmpRS(er, ec, cr + 1, cc, arr);
        count = rcount + dcount;
        arr[cr][cc] = count;
        return count;
    }

    //    iterative storage
    public static int cmpIS(int er, int ec, int cr, int cc) {
        int[][] strg = new int[er + 1][ec + 1];

        //seed
        strg[er][ec] = 1;
        for (int i = er; i >= 0; i--) {
            for (int j = ec; j >= 0; j--) {
                if (i == er || j == ec) {
                    strg[i][j] = 1;
                } else {
                    strg[i][j] = strg[i][j + 1] + strg[i + 1][j];
                }
            }
        }
        return strg[cr][cc];
    }

    //  longest common subsequence
    public static int lcs(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        char cc1 = s1.charAt(0);
        char cc2 = s2.charAt(0);

        String ss1 = s1.substring(1);
        String ss2 = s2.substring(1);
        int result = 0;
        if (cc1 == cc2) {
            result = 1 + lcs(ss1, ss2);
        } else {
            int r1 = lcs(ss1, s2);
            int r2 = lcs(s1, ss2);
            result = Math.max(r1, r2);
        }
        return result;
    }

    //      longest common subsequence ITERATIVELY
    public static int lcsI(String s1, String s2) {
        int[][] arr = new int[s1.length() + 1][s2.length() + 1];

        // seed
        arr[s1.length()][s2.length()] = 0;

        for (int i = s1.length(); i >= 0; i--) {
            for (int j = s2.length(); j >= 0; j--) {
                if (s1.length() == i || s2.length() == j) {
                    arr[i][j] = 0;
                } else {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        arr[i][j] = arr[i + 1][j + 1] + 1;
                    } else {
                        arr[i][j] = Math.max(arr[i][j + 1], arr[i + 1][j]);
                    }
                }
            }
        }
        return arr[0][0];
    }

    public static int editDistance(String s1, String s2) {
        if (s1.length() == 0) {
            return s2.length();
        }
        if (s2.length() == 0) {
            return s1.length();
        }
        String ss1 = s1.substring(1);
        String ss2 = s2.substring(1);
        int result = 0;
        if (s1.charAt(0) == s2.charAt(0)) {
            result = editDistance(ss1, ss2);
        } else {
            int r1 = 1 + editDistance(s1, ss2);
            int r2 = 1 + editDistance(ss2, s1);
            int r3 = 1 + editDistance(ss1, ss2);
            result = Math.min(r1, Math.min(r2, r3));
        }
        return result;
    }

    public static int editDistanceI(String s1, String s2) {
        int[][] arr = new int[s1.length() + 1][s2.length() + 1];

        //seed
        arr[s1.length()][s2.length()] = 0;

        for (int i = s1.length(); i >= 0; i--) {
            for (int j = s2.length(); j >= 0; j--) {
                if (s1.length() == i) {
                    arr[i][j] = s2.length() - j;
                    continue;
                }
                if (s2.length() == j) {
                    arr[i][j] = s1.length() - i;
                    continue;
                }

                if (s1.charAt(i) == s2.charAt(j)) {
                    arr[i][j] = arr[i + 1][j + 1];
                } else {
                    arr[i][j] = 1 + Math.min(arr[i][j + 1], Math.min(arr[i + 1][j], arr[i + 1][j + 1]));
                }
            }
        }
        return arr[0][0];

    }

}
