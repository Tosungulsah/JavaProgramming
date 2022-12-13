package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMEthodPractise {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList("Java","Python","JavaScript","C","C++","JAva","java"));
        list2.removeIf(p-> p.startsWith("J"));
        System.out.println( list2);

    }
}

