// GENERATE SORTED ARRAYS
//Given two sorted arrays A and B, generate all possible arrays such that first element is taken
// from A then from B then from A and so on in increasing order till the arrays exhausted.
// The generated arrays should end with an element from B.

package Lecture7;

import java.util.*;

class SortedArrays {

    /* Function to generates and prints all sorted arrays from alternate
    elements of 'A[i..m-1]' and 'B[j..n-1]'
    If 'flag' is true, then current element is to be included from A
    otherwise from B.
    'len' is the index in output array C[]. We print output array
    each time before including a character from A only if length of
    output array is greater than 0. We try than all possible
    combinations */
    void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n,
                      int len, boolean flag) {
        if (flag) // Include valid element from A
        {
            // Print output if there is at least one 'B' in output array 'C'
            if (len != 0)
                printArr(C, len + 1);

            // Recur for all elements of A after current index
            for (int k = i; k < m; k++) {
                if (len == 0) {
					/* this block works for the very first call to include
					the first element in the output array */
                    C[len] = A[k];

                    // don't increment lem as B is included yet
                    generateUtil(A, B, C, k + 1, j, m, n, len, !flag);
                }

                /* include valid element from A and recur */
                else if (A[k] > C[len]) {
                    C[len + 1] = A[k];
                    generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag);
                }
            }
        }

        /* Include valid element from B and recur */
        else {
            for (int l = j; l < n; l++) {
                if (B[l] > C[len]) {
                    C[len + 1] = B[l];
                    generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag);
                }
            }
        }
    }

    /* Wrapper function */
    void generate(int A[], int B[], int m, int n) {
        int C[] = new int[m + n];

        /* output array */
        generateUtil(A, B, C, 0, 0, m, n, 0, true);
    }

    // A utility function to print an array
    void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        SortedArrays generate = new SortedArrays();
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++) {
            A[i] = s.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            B[i] = s.nextInt();
        }
        int n = A.length;
        int m = B.length;
        generate.generate(A, B, n, m);
    }
}




