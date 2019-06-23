//You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

package Lecture4;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter test cases");
        int n = s.nextInt();
        while (n > 0) {
            System.out.println("Enter range of the numbers to input");
            int m = s.nextInt();
            String str[] = new String[m];
            for (int i = 0; i < str.length; i++) {
                str[i] = s.next();
            }

            List<String> numbers = Arrays.asList(str);

//   sort using a custom function object
            Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

//   print the sorted sequence
//   below line is similar to this line ----> numbers.stream().forEach((x)->System.out.print(x));
            numbers.stream().forEach(System.out::print);
            System.out.println();
            n--;
        }
    }
}