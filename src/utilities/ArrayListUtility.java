package utilities;

import java.util.ArrayList;

public class ArrayListUtility {

    public static ArrayList<Integer> convertArraytoArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);


        }
            return list;
    }
    }
