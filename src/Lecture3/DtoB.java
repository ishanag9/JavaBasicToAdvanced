//Convert Decimal to Binary
package Lecture3;

public class DtoB {
    public static void main(String[] args) {
        int n = 45;
        while(n != 1)
        {
            int m = n%2;
            System.out.print(m);
            n = n / 2;
        }
        System.out.print(1);
    }
}
