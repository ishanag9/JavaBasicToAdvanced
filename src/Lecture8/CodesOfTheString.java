//package Lecture8;
//
//import java.util.ArrayList;
//
//
//public class CodesOfTheString {
//    public static void main(String[] args) {
////        String ans = " ";
//        System.out.println(codesOTS("123456"));
//    }
//
//
//    private static ArrayList<String> codesOTS(String str) {
//
//        if (str.length() == 0) {
//            ArrayList<String> br = new ArrayList<>();
//            br.add("");
//            System.out.print(br);
//            return br;
//        }
//
//        char ch1 = str.charAt(0);
//        char code = (char) (ch1 - '1' + 'a');
//        codesOTS(str.substring(1));
//
//        if (str.length() >= 2 && ch1 <= '2') {
//            int i = Integer.parseInt(str.substring(0, 2), 10);
//            if (i > 0 && i <= 26) {
//                code = (char) (i + 'a' - 1);
//                codesOTS(str.substring(2));
//            }
//        }
//    }
//}
