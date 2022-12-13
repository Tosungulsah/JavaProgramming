package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsPractise {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby"));

        int countJava= Collections.frequency(words,"Java");
        int countPython= Collections.frequency(words,"Python");
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);
    }
}
