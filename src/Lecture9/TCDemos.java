package Lecture9;

// Time Complexity Demos

public class TCDemos {

    public static void main(String[] args) {
//        int[] one = {3, 8, 9};
//        int[] two = {1, 4, 5, 7};
//        int[] ans = merge(one, two);
//        display(arr);

        // Divide & Conquer
        int[] arr = {4, 2, 1, 5, 7, 3};
//       arr =  mergesort(arr,0,arr.length-1);
//        display(arr);

        //Choose pivot algorithm
        quicksort(arr, 0,  arr.length-1);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quicksort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pindex = partition(arr, start, end);
        quicksort(arr,start,pindex-1);
        quicksort(arr,pindex+1,end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pindex = start;
        int pivot = arr[end];
        for (int i = start; i < end - 1; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pindex);
                pindex++;
            }
        }
        swap(arr, pindex, end);
        return pindex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    private static int[] mergesort(int[] arr,int low,int high) {
        if (low == high) {
            int[] br = new int[1];
            br[0] = arr[low];
            return br;
        }
        int mid = (low + high) / 2;
        int[] one = mergesort(arr, low, mid);
        int[] two = mergesort(arr, mid + 1, high);
        int[] ans = merge(one, two);
        return ans;
    }


    private static int[] merge(int[] one, int[] two) {
        int[] ans = new int[(one.length) + (two.length)];
        int i = 0, j = 0, k = 0;

        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                ans[k] = one[i];
                i++;
                k++;
            } else {
                ans[k] = two[j];
                j++;
                k++;
            }
        }
        while (i < one.length) {
            ans[k] = one[i];
            i++;
            k++;

        }
        while (j < two.length) {
            ans[k] = two[j];
            j++;
            k++;

        }
        return ans;
    }
}
