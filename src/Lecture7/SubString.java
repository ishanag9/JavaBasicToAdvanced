package Lecture7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String str = "abc";
//        System.out.println(getSS(str));
//        System.out.println(getPermutations(str));
        int curr = 0;
        int end = 10;

//        System.out.println(getBoardPath(end,curr));

//        printSS("abc", "");
        printPermutations(str);
    }

    private static void printPermutations(String str) {
        char cc = str.charAt(0);
        char ros = str.charAt(1);


//        printPermutations();
//        printPermutations();

    }

    private static void printSS(String str, String res) {
        char cc = str.charAt(0);

        ArrayList<String> list = new ArrayList<>();

    }

//    private static ArrayList<String> getBoardPath(int end, int curr) {
//
//    }

    private static ArrayList<String> getPermutations(String str) {
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myresult = new ArrayList<>();
        ArrayList<String> recresult = getPermutations(ros);
        for (int i = 0; i < recresult.size() ; i++) {


        }
        return myresult;
    }

//    private static ArrayList<String> getSS(String str) {
////        int i=0;
//        ArrayList<String> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//        int j = 1;
//        char cc = str.charAt(i);
//        sb.append(str, i,j);
//        i++;
//        j++;
//        list.add(str);
//        if (str.charAt(i) == str.length()-1) {
//            list.add("");
//            return list;
//        }
//        str = sb.toString();
//        getSS(str);
//        return list;
//    }

}
