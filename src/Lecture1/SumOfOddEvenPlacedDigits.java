package Lecture1;

//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.


import java.util.*;

public class SumOfOddEvenPlacedDigits {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();

        int rem;

        int c = 1, sumEven = 0, sumOdd = 0;

        while (num != 0) {
            if (c % 2 == 0) {
                sumEven = sumEven + num % 10;
            } else {
                sumOdd = sumOdd + num % 10;
            }
            num = num / 10;
            c++;
        }
        System.out.println(sumOdd + " <--SumOdd");
        System.out.println(sumEven + " <--SumEven");

    }

}

