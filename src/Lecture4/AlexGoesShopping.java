/*

        It is Alex’s birthday and she wants to go shopping. She only has ‘A’ units of money
        and she wants to spend all of her money. However, she can only purchase one kind of item.
        She goes to a shop which has ‘n’ types items with prices A0,A1,A2,…,An-1.
        The shopkeeper claims that he has atleast ‘k’ items she can choose from.
        Help her find out if the shopkeeper is correct or not.

        Sample Input:
            4
            100 200 400 100
            5
            100 2
            200 3
            500 4
            600 4
            800 4

        Sample Output:
            Yes
            Yes
            No
            No
            Yes
*/

        package Lecture4;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of items");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter price of each item");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter queries");
        int q = s.nextInt();
        while (q > 0) {
//            Price in query
            int a = s.nextInt();
//            No. of items she want to buy
            int k = s.nextInt();
            if (validate(arr, a, k)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }

    private static boolean validate(int[] arr, int a, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a % arr[i] == 0) {
                count++;
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}
