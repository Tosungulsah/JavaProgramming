package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise2 {
    public static void main(String[] args) {
        ArrayList<String> employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Jimmy","Aaron","David","Shay"));
        employees.retainAll(Arrays.asList("Ali","David"));
        System.out.println(employees);
    }
}
