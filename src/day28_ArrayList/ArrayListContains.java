package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListContains {

        public static void main(String[] args) {
            ArrayList<Character> characters= new ArrayList<>();
            characters.add('A');
            characters.add('A');
            characters.add('A');
            characters.add('A');
            characters.add('A');
        boolean r =characters.contains('A');
        boolean r1 = characters.contains('Z');

            System.out.println("r = " + r);
            System.out.println("r1 = " + r1);
        }
}
