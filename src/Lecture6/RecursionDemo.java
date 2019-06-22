package Lecture6;

import java.util.Scanner;

public class RecursionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();

//        PDISKIP(n);

//        System.out.println(factorial(n));

//        System.out.println("Enter x & n to find x^n");
//        int x = s.nextInt();
//        int n = s.nextInt();
//        System.out.println(power(x, n));

//        fibonacci(n);

//        int[] arr = {3, 8, 9, 14, 17, 21};
        int i = 0;
//        isSorted(arr, i);

        int[] arr2 = {3, 8, 9, 8, 8, 21};
        int value = 8;
//        System.out.println(firstIndex(arr2, i, value));
//        System.out.println(lastIndex(arr2, i, value));
//        allIndices(arr2, i, value);
    }

//    private static int[] allIndices(int[] arr2, int i, int value) {
//
//    }

//    private static int lastIndex(int[] arr2, int i, int value) {
//        int j = arr2.length-1;
//
//    }

    private static int firstIndex(int[] arr2, int i, int value) {
        if (arr2[i] == value) {
            return i;
        }
        if (arr2[i] == arr2.length - 1) {
            return -1;
        } else {
            return firstIndex(arr2, i + 1, value);
        }
    }

//    private static boolean isSorted(int[] arr, int i) {
//        if (arr[i] == arr.length) {
//            return true;
//        }
//
//
//    }
//
//    private static int fibonacci(int n) {
//
//    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return (x * power(x, n - 1));

    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else if (n <= 0) {
            return 0;
        } else {
            return (n * factorial(n - 1));
        }
    }

    private static void PDISKIP(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        PDISKIP(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}
