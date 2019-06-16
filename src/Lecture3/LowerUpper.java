//Print "lowercase" if user enters a character between 'a-z' ,
//Print "UPPERCASE" is character lies between 'A-Z' and
//print "Invalid" for all other characters like $,.^# etc.

package Lecture3;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character");
        char c = s.next().charAt(0);
        int ascii = c;
        if (ascii >= 65 && ascii <= 90) {
            System.out.println("UPPERCASE");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("lowercase");
        } else {
            System.out.println("Invalid");
        }
    }
}
