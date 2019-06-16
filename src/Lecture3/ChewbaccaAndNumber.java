package Lecture3;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        int n = 12345;
        int min = 0;
        int max = 0;
        while (n!=0){
            int rem=n%10;

            min = min + rem;
            n=n/10;
        }
    }
}
