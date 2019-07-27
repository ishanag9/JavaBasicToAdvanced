package Lecture7;

import java.util.Scanner;

public class RecursionDictionaryOrder {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        String str = new String();
        str = s.next();

        dictonary(str);


    }

    public static void dictonary(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char rem = ch[i];
            boolean check = Character.isUpperCase(rem);
            if (check) {
                rem = Character.toLowerCase(rem);
                ch[i] = rem;
            }
        }

        for (int i = 1; i < ch.length; i++) {
            for (int j = i; j > 0 && ch[j] > ch[j - 1]; j--) {
                char temp = ch[j];
                ch[j] = ch[j - 1];
                ch[j - 1] = temp;
            }
        }
        for (int w = 0; w < ch.length; w++) {
            System.out.print(ch[w]);
        }
        System.out.println();
        return;
    }
}
