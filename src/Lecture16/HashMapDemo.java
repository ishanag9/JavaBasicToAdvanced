package Lecture16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
//        System.out.println(map);


//        Intersection of two arrays
        int[] one = {3, 1, 5, 7};
        int[] two = {1, 5, 3, 4, 6};
        System.out.println(getIntersection(one, two));
    }

    private static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], false);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], true);
            }
        }

        Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
        for (Map.Entry<Integer, Boolean> entry : entries) {
            if (entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        return list;
    }


}
