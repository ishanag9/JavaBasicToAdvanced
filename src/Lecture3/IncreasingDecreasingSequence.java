//package Lecture3;
//
//import java.util.Scanner;
//
//public class IncreasingDecreasingSequence {
//    public static void main(String[] args) {
//
//
//        Scanner s = new Scanner(System.in);
//        int p = 1000000000;
//        int t = s.nextInt();
//        while (true) {
//            int n = s.nextInt();
//            if (n > p) {
//                p = n;
//                break;
//            }
//            p = n;
//            t = t - 1;
//        }
//        while (true) {
//            int n = s.nextInt();
//            if (n < p) {
//                System.out.println("false");
//
//                return;
//            }
//            p = n;
//            t = t - 1;
//        }
//        System.out.println("true");
//
//    }
//}
//
//
//
//
