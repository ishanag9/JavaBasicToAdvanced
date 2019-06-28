// Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

package Lecture4;

// Naive Approach
import java.util.Scanner;

public class SumPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        inputarr(arr, s);
//        int[] arr = {1,2,3,4,5};
        System.out.println("Enter target");
        int target = s.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] +" and "+ arr[j]);
                    break;
                }


            }

        }

    }

    private static int[] inputarr(int[] arr, Scanner s) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}



//  O(nlog(n)) solution using sorting


//import java.util.*;
//
//class SumPairs
//{
//    // Naive method to find a pair in an array with given sum
//    public static void findPair(int[] A, int sum)
//    {
//        // sort the array in ascending order
//        Arrays.sort(A);
//
//        // maintain two indices pointing to end-points of the array
//        int low = 0;
//        int high = A.length - 1;
//
//        // reduce search space arr[low..high] at each iteration of the loop
//
//        // loop till low is less than high
//        while (low < high)
//        {
//            // sum found
//            if (A[low] + A[high] == sum)
//            {
//                System.out.println(A[low] +" and "+ A[high]);
//
//            }
//
//            // increment low index if total is less than the desired sum
//            // decrement high index is total is more than the sum
//            if (A[low] + A[high] < sum) {
//                low++;
//            } else{
//                high--;
//            }
//        }
//
//        // No pair with given sum exists in the array
//// 		System.out.println("Pair not found");
//    }
//
//    // Find pair with given sum in the array
//    public static void main (String[] args)
//    {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] A = new int[n];
//        inputarr(A,s);
//
//        int sum = s.nextInt();
//
//        findPair(A, sum);
//    }
//
//    private static int[] inputarr(int[] arr, Scanner s) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
//        return arr;
//    }
//}
