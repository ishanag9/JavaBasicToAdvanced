package Lecture4;

public class ArrOps {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        System.out.println("Current Array");
        display(arr);
//        reverse(arr);

// Find maximum in the array
        int maxValue = max(arr);
        System.out.println("Max value is: " + maxValue);

// Sequentially traverse the array till we found the element
        System.out.println("Index by linear search: " + linearSearch(arr, maxValue));

// Data should be sorted to use binary search
        System.out.println("Index by binary search: " + binarySearch(arr, maxValue));

//        bubblesort(arr);
//        selectionsort(arr);
        insertionsort(arr);
    }

    private static void insertionsort(int[] arr) {

    }

    private static void selectionsort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        System.out.println("After Selection sort: ");
        display(arr);
    }

    private static void bubblesort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("After Bubble sort: ");
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int binarySearch(int[] arr, int data) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] > data) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void reverse(int[] arr) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            swap(arr, beg, end);
            beg++;
            end--;
        }
        System.out.println("Reversed Array");
        display(arr);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
