package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIndexOfLastIndexOf {
    public static void main(String[] args) {
        ArrayList<Character> characters= new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b= characters.lastIndexOf('A');
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
