//package Lecture4;
//
//public class ArrOps {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        display(arr);
//
//        reverse(arr);
//
//        int maxValue = max(arr);
//        System.out.println("Max value is: " + maxValue);
//
//        System.out.println("Index by linear search: " + linearSearch(arr, maxValue));
//
//        System.out.println("Index by binary search: " + binarySearch(arr, 40));
//
//        bubblesort
//    }
//
//    private static void display(int[] arr) {
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int binarySearch(int[] arr, int data) {
//        int beg = 0, end = arr.length - 1;
//        while (beg <= end) {
//            int mid = (beg + end) / 2;
//            if (arr[mid] == data) {
//                return mid;
//            } else if (arr[mid] > data) {
//                end = mid - 1;
//            } else {
//                beg = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    private static int linearSearch(int[] arr, int data) {
//        for (int i = 0; i < arr.length; i++) {
//            if (data == arr[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    private static int max(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[0]) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    private static void reverse(int[] arr) {
//        int beg = 0, end = arr.length - 1;
//        while (beg <= end) {
//            swap(arr, beg, end);
//            beg++;
//            end--;
//        }
//        display(arr);
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}
