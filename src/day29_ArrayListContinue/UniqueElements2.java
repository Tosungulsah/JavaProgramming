package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 2,2, 33, 3,3, 6, 66, 666, 9,9, 999));

        ArrayList<Integer> unique= new ArrayList<>(list1);

        unique.removeIf(p-> Collections.frequency(list1,p)>1);

        System.out.println(unique);

    }
}