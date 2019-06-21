package Lecture3;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='9' && i == 0) {
                i++;
            }
            int digit = arr[i] - '0';
            if (digit >= 5) {
                digit = 9 - digit;
            }
            arr[i]= (char) (digit + '0');
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}

