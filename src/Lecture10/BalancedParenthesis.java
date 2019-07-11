package Lecture10;

import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Stack<Integer> stack = new Stack<>();
        if (isBalanced(str, stack)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isBalanced(String str, Stack stack) {
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                 stack.push(i);
             }
             if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
                 if (stack.isEmpty()) {
                     return false;
                 } else {
                     int val = (int) stack.pop();
                     if (val == '(') {
                         if (str.charAt(i) != '(') {
                             return false;
                         }
                     }
                     if (val == '{') {
                         if (str.charAt(i) != '{') {
                             return false;
                         }
                     }
                     if (val == '[') {
                         if (str.charAt(i) != '[') {
                             return false;
                         }
                     }
                 }
             }
         }
         if (!stack.isEmpty()) {
             return false;
         }
         return true;
    }
}
