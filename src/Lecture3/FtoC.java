//Use of Datatypes
//Convert fahrenheit to calcius
package Lecture3;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                int F = 0;
                while(F<=300){
                    int C = (int)((5.0/9) * (F - 32));
                    System.out.println(F + "\t" + C);
                    F = F + 20;
                }
    }
}
