package Lecture5;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

public class StringOps {
    public static void main(String[] args) {
        String str = "Hello";
        printChars(str);
        subStrings(str);
        insertASCII(str);
    }

    private static void insertASCII(String str) {
        for (int i = 0; i < str.length(); i++) {
            int i1 = str.charAt(i) - str.charAt(i + 1);
            System.out.println(str+i1);

        }
    }

    private static void subStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++)
                System.out.println(str.substring(i, j));
        }
    }

    private static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
