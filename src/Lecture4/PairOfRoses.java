// PAIR OF ROSES
//Deepak has limited amount of money which he can spend on his girlfriend. So he decided to buy two roses for her.
// Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount
// of money on buying roses. As he wishes to spend all the money, he should choose a pair of roses whose prices
// when summed up are equal to the money that he has. Help Deepak choose such a pair of roses for his girlfriend.
//NOTE: If there are multiple solutions print the solution that minimizes the difference between the prices i and j.
// After each test case you must print a blank line.

package Lecture4;

import java.util.*;

public class PairOfRoses {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0;
        int sum = 0;
        int a = 0;
        int b = 0;

        while (i < t) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = s.nextInt();
            }
            int minus = 0;
            int minus1 = 0;
            int m = s.nextInt();
            for (int w = 0; w < arr.length - 1; w++) {

                for (int j = w + 1; j < arr.length; j++) {
                    sum = arr[w] + arr[j];
                    if (sum == m) {
                        if (arr[j] > arr[w])
                            minus = arr[j] - arr[w];
                        else
                            minus = arr[w] - arr[j];
                        if (minus < minus1 || minus1 == 0) {
                            a = j;
                            b = w;
                            minus1 = minus;
                        }

                    }
                }
            }
            if (arr[a] >= arr[b])
                System.out.println("Deepak should buy roses whose prices are " + arr[b] + " " + "and" + " " + arr[a] + ".");
            else
                System.out.println("Deepak should buy roses whose prices are " + arr[a] + " " + "and" + " " + arr[b] + ".");
            System.out.println();
            i++;
        }
    }
}