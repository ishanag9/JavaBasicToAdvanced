package Lecture13;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {3, -5, -1, 4, -2, 6};
        int k = 3;
        FirstNegativeInKSubset(arr, k);
    }

    public static void FirstNegativeInKSubset(int[] arr, int k) {
        int i = 0;
        while (i < arr.length && k <= arr.length) {
            for (int j = i; j < k; j++) {
                if (arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            k++;
            i++;
        }
    }
}
