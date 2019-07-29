// GENERATE PARENTHESES
//Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
//The output strings should be printed in the sorted order considering '(' has higher value than ')'.

// Java program to print all
// combinations of balanced parentheses

package Lecture7;

import java.util.*;

class GenerateParentheses {
    // Function that print all combinations of
    // balanced parentheses
    // open store the count of opening parenthesis
    // close store the count of closing parenthesis
    static void _printParenthesis(char str[], int pos, int n, int open, int close) {
        if (close == n) {
            // print the possible combinations
            for (int i = 0; i < str.length; i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        } else {
            if (open > close) {
                str[pos] = ')';
                _printParenthesis(str, pos + 1, n, open, close + 1);
            }
            if (open < n) {
                str[pos] = '(';
                _printParenthesis(str, pos + 1, n, open + 1, close);
            }
        }
    }

    // Wrapper over _printParenthesis()
    static void printParenthesis(char str[], int n) {
        if (n > 0)
            _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    // driver program
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] str = new char[2 * n];
        printParenthesis(str, n);
    }
}


